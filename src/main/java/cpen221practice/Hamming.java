package cpen221practice;

import java.util.Objects;

class Hamming {

    private String left;
    private String right;


    Hamming(String leftStrand, String rightStrand) {
        this.left = leftStrand;
        this.right = rightStrand;

        if(left == "" && !left.equals(right)){
            throw new IllegalArgumentException("left strand must not be empty.");
        }

        if(right == "" && !right.equals(left)){
            throw new IllegalArgumentException("right strand must not be empty.");

        }
        if (left.length() != right.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance() {


        char[] leftA = left.toCharArray();
        char[] rightA = right.toCharArray();
        int count =0;

        for (int i =0; i < leftA.length; i++){
            if (leftA[i] != rightA[i]){
                count++;
            }
        }
        return count;

    }

}
