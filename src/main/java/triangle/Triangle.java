package triangle;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Triangle {

        private float edgeLengthA = 0;
        private float edgeLengthB = 0;
        private float edgeLengthC = 0;
        private File inputTriangleData;

        public Triangle() {
        }

        /**
        * la somme de 2 côtés d'un triangle doit être supérieure au 3ème côté pour être un triangle
        */
        public Triangle(float a, float b, float c) {

            this.edgeLengthA = a;
            this.edgeLengthB = b;
            this.edgeLengthC = c;

            if(a + b < c && c + b < a && a + c < b ) {
                throw new IllegalArgumentException("Not a triangle.");
            }
        }

        private void testFileWhileReading(Scanner reader) {
            if(!reader.hasNextLine()) throw new IllegalArgumentException("The file is not in right format.");
        }
        public Triangle(File inputTriangleData) {

            try {
                Scanner reader = new Scanner(inputTriangleData);
                this.edgeLengthA = reader.nextInt();
                testFileWhileReading(reader);
                this.edgeLengthB = reader.nextInt();
                testFileWhileReading(reader);
                this.edgeLengthC = reader.nextInt();
                if(reader.hasNextLine()) throw new IllegalArgumentException("The file is not in right format.");
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            this.inputTriangleData = inputTriangleData;

        }

        public float getEdgeLengthA(){
            return this.edgeLengthA;
        }
        public float getEdgeLengthB(){
            return this.edgeLengthB;
        }
        public float getEdgeLengthC(){
            return this.edgeLengthC;
        }

        public void setEdgeLengthA(float a){ this.edgeLengthA = a; }
        public void setEdgeLengthB(float b) { this.edgeLengthB = b; }
        public void setEdgeLengthC(float c) { this.edgeLengthC = c; }


        public enum TriangleType{
            SCALENE,
            ISOCELES,
            EQUILATERAL
        }

        public TriangleType type() {
            if (edgeLengthA == edgeLengthB && edgeLengthB == edgeLengthC) {
                return TriangleType.EQUILATERAL;
            } else if (edgeLengthA == edgeLengthB || edgeLengthA == edgeLengthC || edgeLengthB == edgeLengthC) {
                return TriangleType.ISOCELES;
            } else {
                return TriangleType.SCALENE;
            }

        }


}
