package triangle;

public class Triangle {

        private float edgeLengthA = 0;
        private float edgeLengthB = 0;
        private float edgeLengthC = 0;

        public Triangle() {
        }

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



}
