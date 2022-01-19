package buoi01.object_oriented;

public class BankTestDrive {
    public static void main(String[] args) {
         //Khai báo biến "account", dùng toán tử "new" tạo đối tượng Account trong vùng nhớ Heap, Liên kết biến "account" tới đối trượng trong vùng nhớ heap bằng toán tử gán " = "
        Account account = new Account();
        account.deposit(500000);
        account.show_Account();
        account.withdraw(250000);
        account.show_Account();
        System.out.println("--------------------------------");
        
        //Khai báo biến "employee", dùng toán tử "new" tạo đối tượng employee trong vùng nhớ Heap, Liên kết biến "employee" tới đối trượng trong vùng nhớ heap bằng toán tử gán " = "
        Employee employee = new Employee();
        employee.Employee("Nguyễn Văn Tin",125233, "Tester");
        employee.print_info_Employee();
        System.out.println("--------------------------------");

        //Khai báo biến "customer", dùng toán tử "new" tạo đối tượng Customer trong vùng nhớ Heap, Liên kết biến "customer" tới đối trượng trong vùng nhớ heap bằng toán tử gán " = "
        Customer customer = new Customer();
        customer.Customer("Nguyễn Thị Mạnh", 98768, 135236326);
        customer.print_info_Customer();

    }
}
