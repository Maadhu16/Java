// For loop => use to repeat a block of code iterations when known in advance. 
// Syntax => for(initialization; condition; update){}
// example:

class for_loop{
    public static void main(String args[])
    {
        for (int i = 1; i <= 5; i+=1) {
            System.out.println(i);
        }
    }
}

Output => 1
          2
          3
          4
          5

// example2:

class for_loop{
    public static void main(String args[])
    {
        for (int i = 2; i <= 10; i+=2) {
            System.out.println(i);
        }
    }
}

Output => 2
          4
          6
          8
          10
