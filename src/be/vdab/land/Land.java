package be.vdab.land;

import java.math.BigDecimal;
import java.math.BigInteger;
import be.vdab.util.LandException;
import java.math.RoundingMode;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoang.anh.duc.ton
 */
public class Land {
    private String landCode;
    private String landNaam;
    private String hoofdstad;
    private BigInteger aantalInwoners;
    private BigDecimal oppervlakte;

    public Land(
        String landCode, 
        String landNaam, 
        String hoofdstad, 
        BigInteger aantalInwoners, 
        BigDecimal oppervlakte) 
    {
        try {
            setLandCode(landCode);
            setLandNaam(landNaam);
            setHoofdstad(hoofdstad);
            setAantalInwoners(aantalInwoners);
            setOppervlakte(oppervlakte);
        }
        catch(LandException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public BigDecimal getOppervlakte() {
        return oppervlakte;
    }

    public final void setOppervlakte(
        BigDecimal oppervlakte)
        throws LandException
    {
        if (oppervlakte.compareTo(BigDecimal.ZERO) > 0)
            this.oppervlakte = oppervlakte;
        else
            throw new LandException("Oppervlakte moet groter dan 0 zijn");
    }

    public String getLandCode() {
        return landCode;
    }

    public final void setLandCode(
        String landCode) 
        throws LandException
    {
        if ((landCode == null) || landCode.isEmpty()) {
            throw new LandException("Landcode verplicht in te vullen");
        }
        else
            this.landCode = landCode;
    }

    public String getLandNaam() {
        return landNaam;
    }

    public final void setLandNaam(
        String landNaam) 
        throws LandException
    {
        if ((landNaam == null) || landNaam.isEmpty()) {
            throw new LandException("landNaam verplicht in te vullen");
        }
        else
            this.landNaam = landNaam;
    }

    public String getHoofdstad() {
        return hoofdstad;
    }

    public final void setHoofdstad(String hoofdstad) 
        throws LandException
    {
        if ((hoofdstad == null) || hoofdstad.isEmpty()) {
            throw new LandException("hoofdstad verplicht in te vullen");
        }
        else
            this.hoofdstad = hoofdstad;
    }

    public BigInteger getAantalInwoners() {
        return aantalInwoners;
    }

    public final void setAantalInwoners(
        BigInteger aantalInwoners) 
        throws LandException
    {
        if (aantalInwoners.compareTo(BigInteger.ZERO) > 0)
            this.aantalInwoners = aantalInwoners;
        else
            throw new LandException("Aantal inwoners moet groter dan 0 zijn");
    }

    public BigDecimal bevolkingsDichtheid() {
        BigDecimal bevolkingsDichtHeid;
        bevolkingsDichtHeid = (new BigDecimal(aantalInwoners)).divide(oppervlakte, 5, RoundingMode.HALF_UP);
        return bevolkingsDichtHeid;
    }

    @Override
    public String toString() { 
        return landCode + " ; "+ landNaam + " ; " + hoofdstad + " ; " + 
               aantalInwoners + " ; " + oppervlakte + " ; " + 
               String.format("%5.2f",this.bevolkingsDichtheid());
    }
}
