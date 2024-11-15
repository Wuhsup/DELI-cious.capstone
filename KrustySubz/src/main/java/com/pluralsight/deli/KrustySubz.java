package com.pluralsight.deli;

import com.pluralsight.deli.datamanager.Receipt;
import com.pluralsight.deli.model.Drinks;
import com.pluralsight.deli.model.Item;
import com.pluralsight.deli.model.Sandwich;
import com.pluralsight.deli.model.enums.BreadSize;
import com.pluralsight.deli.model.enums.BreadType;
import com.pluralsight.deli.model.enums.DrinkSize;
import com.pluralsight.deli.model.enums.Topping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class KrustySubz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Let's make your sub Krusty! Let's start with the sandwich size:");
            System.out.println("1. Small (Not that hungry.)");
            System.out.println("2. Medium (Wouldn't mind having some for later.");
            System.out.println("3. Large (IM HANGRY!");

            int sizeChoice = scanner.nextInt();  // reads input
            scanner.nextLine();


            BreadSize size = null;
            switch (sizeChoice) {
                case 1:
                    size = BreadSize.SMALL;
                    break;
                case 2:
                    size = BreadSize.MEDIUM;
                    break;
                case 3:
                    size = BreadSize.LARGE;
                    break;
                default:
                    System.out.println("Woopsiee, looks like you didn't select the correct Bread Size. I'm just going to assume you want a medium.");
                    size = BreadSize.MEDIUM;
            }

            System.out.println("Let's get ready to choose the bread you want:");
            System.out.println("1. White");
            System.out.println("2. Wheat");
            System.out.println("3. Rye");
            System.out.println("4. Wrap");

            int breadChoice = scanner.nextInt();
            scanner.nextLine();

            BreadType breadType = null;
            switch (breadChoice) {
                case 1:
                    breadType = BreadType.WHITE;
                    break;
                case 2:
                    breadType = BreadType.WHEAT;
                    break;
                case 3:
                    breadType = BreadType.RYE;
                    break;
                case 4:
                    breadType = BreadType.WRAP;
                    break;
                default:
                    System.out.println("Hang on their Cow(person)! Your bread selection is invalid. Wanna just go with White Bread? ");
                    breadType = BreadType.WHITE;
            }

            // Create the Sandwich object using the chosen size and bread type
            Sandwich sandwich = new Sandwich(size, breadType);
            System.out.println("Your " + size + " " + breadType + " has been selected! YOU GO GOOFY GOOBER!");

            // List of all the toppings..
            List<Topping> selectedToppings = new ArrayList<>();
            System.out.println("Let's make this Krusty Sub taste GOODT! Pick your options! Please separate numbers with commas. Ex: 1,2,3):");
            System.out.println("1. American Cheese");
            System.out.println("2. Provolone Cheese");
            System.out.println("3. Cheddar Cheese");
            System.out.println("4. Swiss Cheese");
            System.out.println("-------------");
            System.out.println("5. Steak");
            System.out.println("6. Ham");
            System.out.println("7. Salami");
            System.out.println("8. Roast Beef");
            System.out.println("9. Chicken");
            System.out.println("10. Bacon");
            System.out.println("-------------");
            System.out.println("11. Lettuce");
            System.out.println("12. Peppers");
            System.out.println("13. Onions");
            System.out.println("14. Tomatoes");
            System.out.println("15. Jalapenos");
            System.out.println("16. Cucumbers");
            System.out.println("17. Pickles");
            System.out.println("18. Guacamole");
            System.out.println("19. Mushrooms");

            String toppingInput = scanner.nextLine();
            String[] toppingNumbers = toppingInput.split(",");

            for (String number : toppingNumbers) {
                int toppingChoice = Integer.parseInt(number.trim());
                switch (toppingChoice) {
                    case 1:
                        selectedToppings.add(Topping.AMERICAN);
                        break;
                    case 2:
                        selectedToppings.add(Topping.PROVOLONE);
                        break;
                    case 3:
                        selectedToppings.add(Topping.CHEDDAR);
                        break;
                    case 4:
                        selectedToppings.add(Topping.SWISS);
                        break;
                    case 5:
                        selectedToppings.add(Topping.STEAK);
                        break;
                    case 6:
                        selectedToppings.add(Topping.HAM);
                        break;
                    case 7:
                        selectedToppings.add(Topping.SALAMI);
                        break;
                    case 8:
                        selectedToppings.add(Topping.ROAST_BEEF);
                        break;
                    case 9:
                        selectedToppings.add(Topping.CHICKEN);
                        break;
                    case 10:
                        selectedToppings.add(Topping.BACON);
                        break;
                    case 11:
                        selectedToppings.add(Topping.Lettuce);
                        break;
                    case 12:
                        selectedToppings.add(Topping.Peppers);
                        break;
                    case 13:
                        selectedToppings.add(Topping.Onions);
                        break;
                    case 14:
                        selectedToppings.add(Topping.Tomatoes);
                        break;
                    case 15:
                        selectedToppings.add(Topping.Cucumbers);
                        break;
                    case 16:
                        selectedToppings.add(Topping.Pickles);
                        break;
                    case 17:
                        selectedToppings.add(Topping.Guacamole);
                        break;
                    case 18:
                        selectedToppings.add(Topping.Mushrooms);
                        break;
                    default:
                        System.out.println("Okay, you didn't select the correct topping choice..: " + toppingChoice);
                }
            }

            // Add toppings to the sandwich
            sandwich.setToppings(selectedToppings);

            // Ask if the customer wants extra meat
            System.out.println("You wanna get extra Krusty and get more meat? I mean you have been in the gym.. (Si or No)");
            String extraMeatInput = scanner.nextLine();
            if (extraMeatInput.equalsIgnoreCase("Si")) {
                sandwich.setExtraMeat(true);
            } else {
                sandwich.setExtraMeat(false);
            }

            System.out.println("WHO WANT'S A COLD SUB? NOT YOU! You want it toasted right? (Si/No)");
            String toastedInput = scanner.nextLine();
            if (toastedInput.equalsIgnoreCase("Si")) {
                sandwich.setToasted(true);
            } else {
                sandwich.setToasted(false);
            }

            // here is where we will display the sandwich details and the total price
            System.out.println("\n------ Sandwich Details ------");
            System.out.println("Size: " + sandwich.getSize());
            System.out.println("Bread Selection: " + sandwich.getBreadType());
            System.out.println("Toppings: " + sandwich.getToppings());
            System.out.println("Extra Meat: " + (sandwich.isExtraMeat() ? "Yes" : "No"));
            System.out.println("Toasted: " + (sandwich.isToasted() ? "Yes" : "No"));
            System.out.println("Total Price: $" + sandwich.totalPrice());

            // create and write the receipt
            String receiptFilePath = "src/main/resources/" + "receipt.txt";  // Path to your receipt file
            BufferedWriter writer = new BufferedWriter(new FileWriter(receiptFilePath, true));  // Open in append mode

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date = dateFormat.format(new Date());

            writer.write("-------- Krusty Subz Receipt --------");
            writer.newLine();
            writer.write("Date & Time: " + date);
            writer.newLine();
            writer.write("Sandwich: " + sandwich.getSize() + " " + sandwich.getBreadType());
            writer.newLine();
            writer.write("Toppings: " + sandwich.getToppings());
            writer.newLine();
            writer.write("Extra Meat: " + (sandwich.isExtraMeat() ? "Yes" : "No"));
            writer.newLine();
            writer.write("Toasted: " + (sandwich.isToasted() ? "Yes" : "No"));
            writer.newLine();
            writer.write("Total Price: $" + sandwich.totalPrice());
            writer.newLine();
            writer.write("-------------------------------------");
            writer.newLine();

            writer.close();

            System.out.println("Receipt has been saved to 'receipt.txt'.");

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } catch (IOException e) {
            System.out.println("Error writing receipt to file.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid topping number format! Please enter numbers separated by commas.");
        } finally {
            scanner.close();
        }
    }
}
