package triangle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Triangle {

        private float edgeLengthA = 0;
        private float edgeLengthB = 0;
        private float edgeLengthC = 0;

        /**
        * la somme de 2 côtés d'un triangle doit être supérieure au 3ème côté pour être un traingle
        */
        public Triangle(float a, float b, float c) {

            this.edgeLengthA = a;
            this.edgeLengthB = b;
            this.edgeLengthC = c;

            if(a + b > c) {
                throw new IllegalArgumentException("Not a triangle.");
            }
        }

        public Triangle(File inputTriangleData) {

            try {
                FileWriter writer = new FileWriter(inputTriangleData, true);
                writer.write("Ligne 1\n");
                writer.write("Ligne 2\n");
                writer.write("Ligne 3\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public float getEdgeLengthA(){
            return edgeLengthA;
        }
        public double getEdgeLengthB(){
            return edgeLengthB;
        }
        public double getEdgeLengthC(){
            return edgeLengthC;
        }

}
