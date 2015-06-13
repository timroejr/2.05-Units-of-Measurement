/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * ©FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: Timothy (TJ) Roe, Jr.
 * Date: June 12, 2015
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double feetPerMile = 5280;      //number of feet per 1 mile
        double kilometerPerMile = 1.60934;
        double kilometer;
        double pound;
        double kilogram;
        double kilogramPerPound = 0.453592;
        double gallons;
        double liters;
        double litersPerGallon = 3.78541;
        //...finish declaring local variables here, including end of line
        //...comments doccumenting purpose of each variable


        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");


        //convert miles to feet
        miles = 3.2;
        feet = miles * feetPerMile;
        System.out.println(miles + " mi. = " + feet + " ft.");
        
        //miles to kilometers
        miles = 3.2;
        kilometer = miles * kilometerPerMile;
        System.out.println(miles + " mi. = " + kilometer + " km.");
        
        //kilometers to miles
        kilometer = 2.4;
        miles = kilometer/kilometerPerMile;
        System.out.println(kilometer + " km. = " + miles + " mi.");
        
        //pounds to kilograms
        pound = 41.5;
        kilogram = pound * kilogramPerPound;
        System.out.println(pound + " lbs. = " + kilogram + " kg.");
        
        //kilograms to pounds
        kilogram = 35.9;
        pound = kilogram/kilogramPerPound;
        System.out.println(kilogram + " kg. = " + pound + " lbs.");
        
        //gallons to liters
        gallons = 10.1;
        liters = gallons * litersPerGallon;
        System.out.println(gallons + " US gal = " + liters + " l.");
        
        //liters to gallons
        liters = 11.1;
        gallons = liters/litersPerGallon;
        System.out.println(liters + " l. = " + gallons + " US gal");
        


    }//end of main method
}//end of class
