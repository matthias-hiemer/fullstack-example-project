/*
****************
* CMAIN.java
****************
* Copyright (c) 2022 by neuefische GmbH (Daniel Schwarz)
****************
 */
package org.example;

abstract class CMAIN_Abstract_Superclass implements IText, IConstants {

    /********************** CONSTANTS **********************/
    /********************** FIELDS **********************/
    /********************** CONSTRUCTOR **********************/
    /********************** STATIC METHODS **********************/

    // die Main Methode befindet sich in der Subklasse "Start.java"

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
        return g.equals(GESCHLECHT_OHNE_SUFFIX) ? NIX : IN;
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