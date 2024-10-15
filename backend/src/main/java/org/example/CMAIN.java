/*
****************
* CMAIN.java
****************
* Copyright (c) 2022 by neuefische GmbH (Daniel Schwarz)
****************
 */
package org.example;

import static org.example.CMETHODS.methods;

//TODO schäner machen
/*
* Author: Daniel Schwarz
* Date: 2022-11-14
* Time: 11:00
* Project: Java-Grundlagen
* Package: org.example
* Class: CMAIN
* Description: Main Klasse
* Version: 0.1
* Since: 0.1
*
* Versionshistorie:
* 0.1: 2022-11-14, Daniel Schwarz: erstellt
 */
public class CMAIN extends CMAIN_Abstract_Superclass implements IText, IConstants {

    /********************** CONSTANTS **********************/
    /********************** FIELDS **********************/
    /********************** CONSTRUCTOR **********************/
    /********************** STATIC METHODS **********************/

    /**
     * DIes Ist Die Main Methode, Die Das Programm STartet.
     * Ist in Java super wichtig, sonst startet das Programm nicht.
     * @param args die Kommandozeilenargumente des Aufrufs
     */
    public static void main(String[] args) {

        https://www.amazon.de/Clean-Code-Handbook-Software-Craftsmanship/dp/0132350882/ref=asc_df_0132350882/?tag=googshopde-21&linkCode=df0&hvadid=310746693071&hvpos=&hvnetw=g&hvrand=1180332637623262664&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1004234&hvtargid=pla-435472505264&psc=1&th=1&psc=1&tag=&ref=&adgrpid=62150065416&hvpone=&hvptwo=&hvadid=310746693071&hvpos=&hvnetw=g&hvrand=1180332637623262664&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1004234&hvtargid=pla-435472505264
        if (true) {
            System.out.println("");
        }
        /*
        * in this first section we declare the variables we need
        *
        * there are different types of variables. the most important ones are:
        * m methods
        * i a scanner for reading from the console
        * t,p,g
        * c1,c2,c3 constants
        *
        *         * Diesen Abschnitt hat Daniel am 14.11.2020 geschrieben
         * ---------------------------------
         * Ziel: Leaderboard ausgeben
         * Sprache: Java
         * Pfad: src/main/java/org/example/CMAIN.java
         */
        var m = methods();

        // here are the variables
        var i = m.read();
        var t = i.nextInt();
        var p = i.nextInt();
        i.nextLine();
        var g = i.nextLine();
        int c1, c2, c3;

        /*
        * In dieser nächsten Sektion schreiben wir das Leaderboard
        *
        * Diesen Abschnitt hat Daniel am 14.11.2020 geschrieben
        * ---------------------------------
        * Ziel: Leaderboard ausgeben
        * Sprache: Java
        * Pfad: src/main/java/org/example/CMAIN.java
         */

        m.f(F_K + g + M + t + TUJ + p + SPT);
        method_nix(m);
        for (c1 = 0; c1 < t; c1++) {
        m.l(c1);
        for (c2 = c1 * p; c2 < c1 * p + p; c2++) {
            var s = printSuffixShort(g);
            var x = s;
            m.f(S + x + LEER + (c2 + 1) + eingabe_Input);
        }
        }

        method_nix(m);
        m.f(RUNDE_1);
        for (c3 = 0; c3 < t; c3++) {
            m.f(((CMAIN.T + (c3 + 1) + SGT)) + (t - c3));
        }

        // Hat anfangs nicht funktioniert, weil ich vergessen habe, die Klasse zu schließen
        method_nix(m);
        var s = printSuffix(g);
        m.f(CMAIN.Si + s + L);
        for (c3 = 0; c3 < t; c3++) {
            m.f(P + (c3 + 1) + eingabe_Input);
        }
    }

    /*
    **********************************************
    * method_nix
     * Ziel: gibt an empty row aus
     * Sprache: Java
     * Pfad: src/main/java/org/example/CMAIN.java
    **********************************************
    * @param m
    * @return
    * @throws IOException falls Ausgabe nicht möglich
     */
    private static void method_nix(CMETHODS m) {
        m.f(NIX);
    }

    /*
     **********************************************
     * Methode printSuffixShort
     * Ziel: gibt etwas zurück, dass später ausgegeben werden kann (Geschlechtsspezifisch, kurz)
     * Sprache: Java
     * Pfad: src/main/java/org/example/CMAIN.java
     **********************************************
     * @param m
     * @return
     * @throws IOException falls Ausgabe nicht möglich
     */
    private static String printSuffixShort(String g) {
        return g.equals(GESCHLECHT_OHNE_SUFFIX) ? NIX : IN; // dieser Punkt kam durch das Ticket T-33192 dazu (altes Ticketsystem, entspricht 99-33192-JAVA im neuen System)
    }

    /*
     **********************************************
     * Methode printSuffix
     * Ziel: gibt etwas zurück, dass später ausgegeben werden kann
     * Sprache: Java
     * Pfad: src/main/java/org/example/CMAIN.java
     **********************************************
     * @param m
     * @return
     * @throws IOException falls Ausgabe nicht möglich
     */
    private static String printSuffix(String g) {
        return g.equals(GESCHLECHT_OHNE_SUFFIX) ? NIX : INNEN;
    }

    /********************** METHODS **********************/

}