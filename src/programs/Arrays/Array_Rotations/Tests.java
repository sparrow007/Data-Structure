package programs.Arrays.Array_Rotations;

class Tests
{
    // Recursive method to return gcd of a and b
//    static int gcd(int a, int b)
//    {
//        if (a == 0)
//            return b;
//        return gcd(b % a, a);
//    }

    // method to return LCM of two numbers
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }

    static int gcd(int a, int b) {
        if(a == 0) return b;

        return gcd(b % a , a);
    }

    // Driver method
    public static void main(String[] args)
    {
        int a = 6, b = 3;
        System.out.println("LCM of " + a +
                " and " + b +
                " is " + lcm(a, b));
    }
}
