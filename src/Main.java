import command.*;
import templatemethod.*;
import mediator.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== COMMAND PATTERN ===");

        Light light = new Light();
        TV tv = new TV();

        RemoteControl remote = new RemoteControl();

        remote.setCommand(new LightOnCommand(light));
        remote.pressButton();

        remote.setCommand(new TVOnCommand(tv));
        remote.pressButton();


        System.out.println("\n=== TEMPLATE METHOD ===");

        ReportGenerator pdf = new PdfReport();
        pdf.generateReport();

        ReportGenerator excel = new ExcelReport();
        excel.generateReport();


        System.out.println("\n=== MEDIATOR PATTERN ===");

        ChatMediator chat = new ChatMediator();

        User user1 = new User(chat, "Ali");
        User user2 = new User(chat, "Dana");

        chat.addUser(user1);
        chat.addUser(user2);

        user1.send("Hello!");
    }
}
