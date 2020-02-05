package com.company.libraryIS;

import java.util.Scanner;

public class LibraryBranch {
    String webpage;
    long telephonenumber;
    String email;
    String address;
    String OHmonday;
    String OHtuesday;
    String OHwednesday;
    String OHthursday;
    String OHfriday;
    String OHsaturday;

    public LibraryBranch(String webpage, long telephonenumber, String email, String address, String OHmonday, String OHtuesday, String OHwednesday, String OHthursday, String OHfriday, String OHsaturday) {
        this.webpage = webpage;
        this.telephonenumber = telephonenumber;
        this.email = email;
        this.address = address;
        this.OHmonday = OHmonday;
        this.OHtuesday = OHtuesday;
        this.OHwednesday = OHwednesday;
        this.OHthursday = OHthursday;
        this.OHfriday = OHfriday;
        this.OHsaturday = OHsaturday;
    }

    public static void showBranches() {
        LibraryBranch zabovresky = new LibraryBranch("http://www.kjm.cz/provoz/zabovresky-mozolky-52", 123456789, "mozolky@kjm.cz", "Mozolky 52, 616 00 Brno",
                "10:00 - 12:00, 13:00 - 18:00", "10:00 - 12:00, 13:00 - 18:00", "10:00 - 15:00", "10:00 - 12:00, 13:00 - 18:00", "", "");

        LibraryBranch ustredniknihovna = new LibraryBranch("http://www.kjm.cz/knihovna-pro-dospele", 987654321, "vypujcky@kjm.cz", "Koblizna 4, 601 50 Brno",
                "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 20:00", "10:00 - 14:00");

        System.out.println("Branch Zabovresky: " + "web: " + zabovresky.webpage + ", Telephone number: " + zabovresky.telephonenumber + ", Email: " + zabovresky.email + ", Address: " + zabovresky.address +
                ", Opening hours: Monday: " + zabovresky.OHmonday + ", Tuesday: " + zabovresky.OHtuesday + ", Wednesday: " + zabovresky.OHwednesday + ", Thursday: " + zabovresky.OHthursday +
                ", Friday: " + zabovresky.OHfriday + ", Satuday: " + zabovresky.OHsaturday);

        System.out.println("Branch Ustredni knihovna: " + "web: " + ustredniknihovna.webpage + ", Telephone number: " + ustredniknihovna.telephonenumber + ", Email: " + ustredniknihovna.email + ", Address: " + ustredniknihovna.address +
                ", Opening hours: Monday: " + ustredniknihovna.OHmonday + ", Tuesday: " + ustredniknihovna.OHtuesday + ", Wednesday: " + ustredniknihovna.OHwednesday + ", Thursday: " + ustredniknihovna.OHthursday +
                ", Friday: " + ustredniknihovna.OHfriday + ", Satuday: " + ustredniknihovna.OHsaturday);

    }
}
