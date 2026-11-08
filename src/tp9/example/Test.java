package tp9.example;

public class Test {
	    public static void main(String[] args) {
	        try {
	            int val = 5;
	            int res = val / 0;
	            System.out.println("Le résultat est : " + res);
	        } catch (ArithmeticException ex) {
	            System.out.println("Attention, vous effectuez une division par zéro !");
	            ex.printStackTrace();
	        }
	    }
	}

