package codesignal.rainsOfReason;

import codesignal.exploringTheWater.AlternatingSums;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayReplaceTest {


    public ArrayReplace arrayReplace;

    @Before
    public void setUp() {
        arrayReplace = new ArrayReplace();
    }
    @Test
    public void  check(){
        int[] inputArray = {1, 2, 1};
        int elemToReplace =1;
        int substitutionElem = 3;
        int [] expectedResult= {3, 2, 3};
        Assert.assertArrayEquals(arrayReplace.arrayReplace(inputArray,elemToReplace,substitutionElem),expectedResult);
    }
    @Test
    public void  check2(){
        int[] inputArray = {1, 2, 3, 4, 5};
        int elemToReplace =3;
        int substitutionElem = 0;
        int [] expectedResult= {1, 2, 0, 4, 5};
        Assert.assertArrayEquals(arrayReplace.arrayReplace(inputArray,elemToReplace,substitutionElem),expectedResult);
    }
    @Test
    public void  check3(){
        int[] inputArray = {1, 1, 1};
        int elemToReplace =1;
        int substitutionElem = 10;
        int [] expectedResult= {10, 10, 10};
        Assert.assertArrayEquals(arrayReplace.arrayReplace(inputArray,elemToReplace,substitutionElem),expectedResult);
    }   @Test
    public void  check4(){
        int[] inputArray = {1, 2, 1, 2, 1};
        int elemToReplace =2;
        int substitutionElem = 1;
        int [] expectedResult= {1, 1, 1, 1, 1};
        Assert.assertArrayEquals(arrayReplace.arrayReplace(inputArray,elemToReplace,substitutionElem),expectedResult);
    }   @Test
    public void  check5(){
        int[] inputArray = {1, 2, 1, 2, 1};
        int elemToReplace =2;
        int substitutionElem = 2;
        int [] expectedResult= {1, 2, 1, 2, 1};
        Assert.assertArrayEquals(arrayReplace.arrayReplace(inputArray,elemToReplace,substitutionElem),expectedResult);
    }   @Test
    public void  check6(){
        int[] inputArray = {3, 1};
        int elemToReplace =3;
        int substitutionElem = 9;
        int [] expectedResult= {9, 1};
        Assert.assertArrayEquals(arrayReplace.arrayReplace(inputArray,elemToReplace,substitutionElem),expectedResult);
    }   @Test
    public void  check7(){
        int[] inputArray = {10, 10};
        int elemToReplace =0;
        int substitutionElem = 9;
        int [] expectedResult= {10, 10};
        Assert.assertArrayEquals(arrayReplace.arrayReplace(inputArray,elemToReplace,substitutionElem),expectedResult);
    }   @Test
    public void  check8(){
        int[] inputArray = {2, 1};
        int elemToReplace =3;
        int substitutionElem = 9;
        int [] expectedResult= {2, 1};
        Assert.assertArrayEquals(arrayReplace.arrayReplace(inputArray,elemToReplace,substitutionElem),expectedResult);
    }
}
