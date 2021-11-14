package ui;

import controllers.use_cases.CustomerManager;
import controllers.use_cases.UserManager;
import entities.Customer;
import entities.ShoppingList;

import java.util.ArrayList;

public class CustomerActivity implements Activity{
    // This variable contains the current user.
    private Customer cus;
    private CustomerManager cm;
    // This variable contains all the available command.
    private final String commandList =
            "Please type in the corresponding number of the following command\n" +
            "1. place order: start to place an order \n" +
            "2. order status: show your current order status \n" +
            "3. user info: gets the current username and the type of the current account \n" +
            "4. sign out: sign out from the current account \n" +
            "5. quit: quit the program \n";

    @Override
    public void display() {

        cm = (CustomerManager) UserManager.getUserManager("CUSTOMER");
        boolean activityShift = false;

        while (!activityShift) {
            sio.sendOutput("$ Please type in command (Type in \"help\" to get help) $");
            String command = sio.getInput();
            switch (command) {
                case "1": // The customer places the order.
                    this.save();
                    sio.sendOutput("Starting order placement");
                    sio.intent(new ShoppingListActivity(), this.cus);
                    activityShift = true;
                    break;

                case "2": // If the user wants to check order status, switch to the order status activity.
                    this.save();
                    sio.sendOutput("Status of the order:");
                    sio.intent(new OrderStatusActivity(), this.cus);
                    break;

                case "3": // If the user wants user info, prompt the info of current account.
                    sio.sendOutput("Username: " + this.cus.getName() +
                            "  Account type: Customer");
                    break;

                case "4": // If the user wants to sign out, sign out the current account and
                    // require login again
                    this.save();
                    sio.sendOutput("Sign out successful, please login");
                    sio.intent(new SignInActivity(), null);
                    activityShift = true;
                    break;

                case "5": // If the user wants to quit, quit the program.
                    this.save();
                    System.exit(0);
                    return;

                case "help": // If the user enters help, give them help.
                    sio.sendOutput(commandList);
                    break;
            }
        }
    }

    // A private method that saves the data to database using customer manager.
    private void save(){
        this.cm.save(this.cus.getName(), this.cus);
    }

    @Override
    public void getData(Object transferredData) {
        this.cus = (Customer) transferredData;
    }
}