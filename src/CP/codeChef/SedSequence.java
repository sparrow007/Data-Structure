package CP.codeChef;

import java.util.Scanner;
import java.util.TreeMap;

public class SedSequence{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SedSequence sedSequence = new SedSequence();
        System.out.println("hash code of sedseu " + sedSequence.hashCode());

        SedSequence sedSequence1 = new SedSequence();

        System.out.println("hash code of sedseu1 " + sedSequence1.hashCode());


        /**
         * Cop
         */

        /**
         * Hashmap = 16
         * (key, value)
         * key object -> hascode -> algo -> index
         * key object -> 1
         * get(key)
         * object -> hascode -> algo->index
         * key
         * key object -> hascode -> algo -> index = 1, ineed value
         * get(key) ->> hashcode -> algo -> index = 1
         *
         * [0]-->[]
         * [1]-->[hashcode| key| value|----> [hashcode|key|value|null]
         * [2]
         * [3]
         * [4]
         * [5]
         *
         *
         * too large -> search or getting complicated
         * loadfactor = 0.75;
         * 100MB * 0.75 = 75MB
         *
         * 175MB
         *
         * initilcapcity = 16 =, loadfactor = 0.75
         *
         */
    }
}
