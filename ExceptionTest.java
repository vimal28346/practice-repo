class ExceptionTest {
    public static void main(String args[]) {
        ExceptionTest obj=new ExceptionTest();
        try{
            obj.withdraw(120);
        }
        catch(InsufficientBalanceException e){
            System.out.println("Exception caught"+e.getMessage());
        }
    }
    void withdraw(int amt)
    throws InsufficientBalanceException{
        if(amt>100){
            throw new InsufficientBalanceException("Insufficient balance");
        }
    }
}
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String m){
        super(m);
    }
}