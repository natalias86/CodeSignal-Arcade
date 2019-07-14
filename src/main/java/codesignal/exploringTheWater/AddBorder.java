package codesignal.exploringTheWater;
/*2
*Given a rectangular matrix of characters, add a border of asterisks(*) to it.
Example
For
picture = ["abc",
           "ded"]
the output should be
addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]*/
public class AddBorder {
        String[] addBorder(String[] picture) {
        String str = picture[0];
        int counter=str.length();
        int pictureLength = picture.length;
        char[][] inputArray2Dim = new char[pictureLength][];

        for (int i = 0; i < picture.length; i++) {
            inputArray2Dim[i] = picture[i].toCharArray();
        }
        char[][] strArray =new char [pictureLength+2][counter+2];

        for(int i = 0;i<strArray.length;i++){

            for (int j =0; j<strArray[i].length; j++){

                if (i==0||i==strArray.length-1){
                    strArray[i][j] = 42;
                }else if(i!=0&&(j==0||j==strArray[i].length-1)){
                    strArray[i][j]=42;
                }else{
                    strArray[i][j]= inputArray2Dim[i-1][j-1];
                }
            }
        }
        String[] pictureOutput = new String [strArray.length];
        for (int i = 0;i<strArray.length;i++){
            pictureOutput[i]=String.valueOf(strArray[i]);
        }
        return pictureOutput;
    }
}
