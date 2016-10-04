/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.land;

import be.vdab.land.Land;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author hoang.anh.duc.ton
 */
public class Main {
  public static void main(String[] args) {  
      Land hetLand = null; 
      BigInteger totInwoners = BigInteger.ZERO;
      BigDecimal totOppervlakte = BigDecimal.ZERO;
      BigDecimal gemBevolkingsdichtheid;// = BigDecimal.ZERO;
      BigDecimal absVerschil = BigDecimal.valueOf(Double.MAX_VALUE);

      List<Land> landen = new ArrayList<>();
      landen.add(new Land("Ag", "Argentinië", "Buenos Aires", BigInteger.valueOf(38500000L), BigDecimal.valueOf(2825647.56)) );
      landen.add(new Land("Bg", "Bulgarije", "Sofia", BigInteger.valueOf(7800000L), BigDecimal.valueOf(111002.42)) );
      landen.add(new Land("Ey", "Egypte", "Cairo", BigInteger.valueOf(72000000L), BigDecimal.valueOf(997739.83)) );
      landen.add(new Land("In", "India", "New Delhi", BigInteger.valueOf(1060000000L), BigDecimal.valueOf(3336251.12)) );
      landen.add(new Land("It", "Italië", "Rome", BigInteger.valueOf(57840000L), BigDecimal.valueOf(301268.14)) );
      landen.add(new Land("L", "Luxemburg", "Luxemburg", BigInteger.valueOf(462690L), BigDecimal.valueOf(2586.27)) );
      landen.add(new Land("N", "Noorwegen", "Oslo", BigInteger.valueOf(4600000L), BigDecimal.valueOf(386958.22)) );
      landen.add(new Land("B", "België", "Brussel", BigInteger.valueOf(10400000L), BigDecimal.valueOf(30528.56)) );
      landen.add(new Land("Si", "Singapore", "Singapore", BigInteger.valueOf(4200000L), BigDecimal.valueOf(640.94)) );
      landen.add(new Land("Us", "Verenigde Staten", "Washington DC", BigInteger.valueOf(293000000L), BigDecimal.valueOf(9165487.63)) );

      for (Land eenLand : landen) {
          if(eenLand != null) {
            totOppervlakte = totOppervlakte.add( eenLand.getOppervlakte());
            totInwoners = totInwoners.add(eenLand.getAantalInwoners());
            System.out.println(eenLand);
          }
      }
      gemBevolkingsdichtheid = (new BigDecimal(totInwoners) 
                    ).divide(totOppervlakte, 2, RoundingMode.HALF_UP) ;
          
      for (Land eenLand : landen) {
          if ( ((eenLand.bevolkingsDichtheid()
                 .subtract(gemBevolkingsdichtheid))
               .abs())
               .compareTo(absVerschil) < 0 ) {
               hetLand = eenLand;
               absVerschil = (eenLand.bevolkingsDichtheid()
                             .subtract(gemBevolkingsdichtheid)).abs();
          }
      } 

        DecimalFormat fmt = new DecimalFormat("#0.00");
        System.out.println("\nDe gemiddelde bevolkingsdichtheid is " + 
            fmt.format(gemBevolkingsdichtheid));        
        System.out.println("Het land dat het dichtst aanleunt bij dit gemiddelde is " + hetLand.getLandNaam() + 
            " met een bevolkingsdichtheid van " + 
            fmt.format(hetLand.bevolkingsDichtheid() ));
  }
}
 

