class neww {
    public static void main(String args[]) {
        try{
            int x=10/0;
            System.out.println(x);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Block executed");
        }
    }
}
