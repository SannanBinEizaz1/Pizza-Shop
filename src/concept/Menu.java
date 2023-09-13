
package concept;


import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
 
//Variables declaration
 ArrayList <IPizza> pizzaList = new ArrayList<IPizza>(); 
 int input=0;
 String pizzaName="";
 Scanner in = new Scanner(System.in);
 int chickenCount=0, pepproniCount=0, veganCount=0,margaritaCount=0;
 double searchPrice=0;
 Pizza pizza;
    
//Default construtor
 public Menu(){}
 
 
//Main menu function contains home screen
public  void MainMenu()
    {
        System.out.println("Welcome to the Pizza Shop \n Please Select one Option \n 1- Order Pizza \n 2- View Orders \n 3- Edit Order \n 4- Pay \n 6- Exit \n Enter option here (e.g 1 2 ):- \n  ");
        input = in.nextInt();
            
        if(input>=6)
            {
                System.out.println("You have enetered an invalid Option Please Try gain \n Enter option here (e.g 1 2 ):- \n");
                input = in.nextInt();
            }
        else
            {
                switch(input)
                    {
                        case 1:
                          pizzatype();
                        case 2:
                          ViewOrders();
                        case 3:
                          Editmenu();
                        case 4:
                          System.exit(0);
                    }
            }
    }

//Menu function that contains pizza  flavours and completes order by adding pizza into array
public  void menu(String base, String cheese,boolean sause)
 {  
    System.out.println("Please Select your Pizza\n 1- Chicken Pizza \n 2- Pepproni Pizza \n 3- Vegan Pizza \n 4- Margarita Pizza \n Please enter your option = \n");
    int input= in.nextInt();
    if(input==1)
        {
            pizza = new ChickenPizza(sause,base,cheese);
            pizzaList.add(pizza);
            completeOrder();
        }
    if(input==2)
        {
            pizza = new PepproniPizza(sause,base,cheese);
            pizzaList.add(pizza);
            completeOrder();
        }
    if(input==3)
        {
            pizza = new VeganPizza(sause,base,cheese);
            pizzaList.add(pizza);
            completeOrder();
        } 
    else if(input==4)
        {
            pizza= new MargaritaPizza(sause,base,cheese);
            pizzaList.add(pizza);
            completeOrder();
        }
    else
        {
            System.out.println("Invalid Option Please try again \n Please enter your option = \n");
            input= in.nextInt();
        }

 }


//pizzatype function contains all pizza creation station
public  void pizzatype()
 {
    String base="thick",cheese="Mozzrella";
    boolean sause=true;
    System.out.println("Please Select Base of Pizza");
    System.out.println("1- Thick");
    System.out.println("2- Thin");
    System.out.print("Please enter your option = ");
    int input= in.nextInt();
    if(input==1)
        {
            base="Thick";
        }
    else if(input==2)
        {
            base="Thin";
        }
    else 
        {
            System.out.println("Invalid Option please Select Again ");
            System.out.print("Please enter your option = ");
            input= in.nextInt();
        }

    System.out.print("Please enter your Cheese Option 1- Mozzerella or 2- Vegan = ");
    input= in.nextInt();
    if(input==1)
        {
            cheese="Mozzerella";
        }
    else if(input==2)
        {
            cheese="Vegan";
        }
    else
        {
            System.out.println("Invalid Option please Select Again ");
            System.out.print("Please enter your option = ");
            input= in.nextInt();
        }

    System.out.print("Please enter your Sause Option 1- with Sause or 2- No Sause = ");
    input= in.nextInt();
    if(input==1)
          {
            sause= true;
          }
    else if(input==2)
          {
            sause= false;
          }
    else 
          {
            System.out.println("Invalid Option please Select Again ");
            System.out.print("Please enter your option = ");
            input= in.nextInt();
          }
    menu(base,cheese,sause);
 }


public  void completeOrder()
    {
    System.out.print("Press 1 for MainMenu  = ");
    input= in.nextInt();
    if(input==1)
    {
    MainMenu();
    }
    else {
        System.out.println("Invalid Option please Select Again ");
    System.out.print("Please enter your option = ");
    input= in.nextInt();
    }
    }


public  void Editmenu()
{
    int size=0;
    if(pizzaList.isEmpty())
    {
         System.out.println("No order found \nPress 1 to go Back = ");
        input = in.nextInt();
        if(input==1)
            MainMenu();
        else{
            System.out.println("Inavalid option Please Press 1 = ");
        input = in.nextInt();
        }
    }
      else {
          double chickenPrice=0,pepproniPrice=0,veganPrice=0,margaritaPrice=0;
        chickenCount=0;
        pepproniCount=0;
        veganCount=0;
        margaritaCount=0;
 for(IPizza ipizza:pizzaList)
{
 if(ipizza instanceof ChickenPizza)
 {
  chickenCount++;
  chickenPrice=ipizza.getPrice();
  
 }


 if(ipizza instanceof PepproniPizza)
 {
  pepproniCount++;
  pepproniPrice=ipizza.getPrice();
 }

 if(ipizza instanceof VeganPizza)
 {
  veganCount++;
  veganPrice=ipizza.getPrice();
 }
 if(ipizza instanceof MargaritaPizza)
 {
  margaritaCount++;
  margaritaPrice=ipizza.getPrice();
 }
}
   
System.out.println("Total Orders");
System.out.println("1- Total Chicken Pizza = " + chickenCount);
System.out.println("2- Total Pepproni Pizza = " + pepproniCount);
System.out.println("3- Total Vegan Pizza = " + veganCount);
System.out.println("4- Total Margarita Pizza = " + margaritaCount);
System.out.println("Select Option to Edit Pizza or Press 5 for Main Menu ");
input=in.nextInt();
if(input==1)
{
    
    int thickCount=0,thinCount=0;
    for(IPizza ipizza:pizzaList)
    {
      if(ipizza instanceof ChickenPizza)
      {
          ChickenPizza chickenPizza = (ChickenPizza) ipizza;
          if(chickenPizza.getBase().equals("Thick"))
          {
              thickCount++;
          }
          else
          {
              thinCount++;
          }
      }
        
    }
    System.out.println("Total Thick Base pizza = " + thickCount);
        System.out.println("Total Thin Base pizza = " + thinCount);
      System.out.println("Press 1- Edit All 2- Edit specific Number 3- Cancel ");
      input=in.nextInt();
      if(input==1)
      {
          System.out.println("Select 1- for All Thin 2- For All Thick");
          input=in.nextInt();
          for(IPizza ipizza:pizzaList)
    {
      if(ipizza instanceof ChickenPizza)
      {
          if(input==1)
          {
              ((ChickenPizza)ipizza).setBase("Thin");
          }
          else
          {
             ((ChickenPizza)ipizza).setBase("Thick");
          }
      }
      }
          MainMenu();
}
      if(input==2)
      {
            System.out.println("Select 1- for Thin 2- For Thick");
          input=in.nextInt();
          if(input==1)
          {
              System.out.println("Total number of Thin Pizza = "+ thinCount);
              System.out.println("Enter number pizza want to change = ");
              size=in.nextInt();
          for(int i= 0;i<size;i++)
          {
              
             IPizza ipizza= pizzaList.get(i);
             if(ipizza instanceof ChickenPizza)
             {
                 if(((ChickenPizza) ipizza).getBase()=="Thin")
                 ((ChickenPizza)ipizza).setBase("Thick");
             }
              
          
          }
          Editmenu();
          }
          if(input==2)
          {
              System.out.println("Total number of Thick Pizza = "+ thickCount);
              System.out.println("Enter number pizza want to change = ");
              size=in.nextInt();
          for(int i= 0;i<size;i++)
          {
             IPizza ipizza= pizzaList.get(i);
             if(ipizza instanceof ChickenPizza)
             {  
                 
                 if(((ChickenPizza)ipizza).getBase()=="Thick")
                 ((ChickenPizza)ipizza).setBase("Thin");
             }
              
          
          }
          Editmenu();
          }
      }
      
      if(input==3)
      {
          Editmenu();
      }

}
if(input==2)
{
      int thickCount=0,thinCount=0;
    for(IPizza ipizza:pizzaList)
    {
      if(ipizza instanceof PepproniPizza)
      {
          PepproniPizza pepproniPizza = (PepproniPizza) ipizza;
          if(pepproniPizza.getBase().equals("Thick"))
          {
              thickCount++;
          }
          else
          {
              thinCount++;
          }
      }
        
    }
    System.out.println("Total Thick Base pizza = " + thickCount);
        System.out.println("Total Thin Base pizza = " + thinCount);
      System.out.println("Press 1- Edit All 2- Edit specific Number 3- Cancel ");
      input=in.nextInt();
      if(input==1)
      {
          System.out.println("Select 1- for All Thin 2- For All Thick");
          input=in.nextInt();
          for(IPizza ipizza:pizzaList)
    {
      if(ipizza instanceof PepproniPizza)
      {
          if(input==1)
          {
              ((PepproniPizza)ipizza).setBase("Thin");
          }
          else
          {
             ((PepproniPizza)ipizza).setBase("Thick");
          }
      }
      }
          MainMenu();
}
      if(input==2)
      {
           System.out.println("Select 1- for Thin 2- For Thick");
          input=in.nextInt();
          if(input==1)
          {
              System.out.println("Total number of Thin Pizza = "+ thinCount);
              System.out.println("Enter number pizza want to change = ");
              size=in.nextInt();
          for(int i= 0;i<size;i++)
          {
             IPizza ipizza= pizzaList.get(i);
             if(ipizza instanceof PepproniPizza)
             {
                 if(((PepproniPizza)ipizza).getBase()=="Thin")
                 ((PepproniPizza)ipizza).setBase("Thick");
             }
              
          
          }
          Editmenu();
          }
          if(input==2)
          {
              System.out.println("Total number of Thick Pizza = "+ thickCount);
              System.out.println("Enter number pizza want to change = ");
              size=in.nextInt();
          for(int i= 0;i<size;i++)
          {
             IPizza ipizza= pizzaList.get(i);
             if(ipizza instanceof PepproniPizza)
             {
                 if(((PepproniPizza)ipizza).getBase()=="Thick")
                 ((PepproniPizza)ipizza).setBase("Thin");
             }
              
          
          }
          Editmenu();
          }
      }
      
      if(input==3)
      {
          Editmenu();
      }

}
if(input==3)
{
      int thickCount=0,thinCount=0;
    for(IPizza ipizza:pizzaList)
    {
      if(ipizza instanceof VeganPizza)
      {
          VeganPizza veganPizza = (VeganPizza) ipizza;
          if(veganPizza.getBase().equals("Thick"))
          {
              thickCount++;
          }
          else
          {
              thinCount++;
          }
      }
        
    }
    System.out.println("Total Thick Base pizza = " + thickCount);
        System.out.println("Total Thin Base pizza = " + thinCount);
      System.out.println("Press 1- Edit All 2- Edit specific Number 3- Cancel ");
      input=in.nextInt();
      if(input==1)
      {
          System.out.println("Select 1- for All Thin 2- For All Thick");
          input=in.nextInt();
          for(IPizza ipizza:pizzaList)
    {
      if(ipizza instanceof VeganPizza)
      {
          if(input==1)
          {
              ((VeganPizza)ipizza).setBase("Thin");
          }
          else
          {
             ((VeganPizza)ipizza).setBase("Thick");
          }
      }
      }
          MainMenu();
}
      if(input==2)
      {
          System.out.println("Select 1- for Thin 2- For Thick");
          input=in.nextInt();
          if(input==1)
          {
              System.out.println("Total number of Thin Pizza = "+ thinCount);
              System.out.println("Enter number pizza want to change = ");
              size=in.nextInt();
          for(int i= 0;i<size;i++)
          {
             IPizza ipizza= pizzaList.get(i);
             if(ipizza instanceof VeganPizza)
             {
                 if(((VeganPizza)ipizza).getBase()=="Thin")
                 ((VeganPizza)ipizza).setBase("Thick");
             }
              
          
          }
          Editmenu();
          }
          if(input==2)
          {
              System.out.println("Total number of Thick Pizza = "+ thickCount);
              System.out.println("Enter number pizza want to change = ");
              size=in.nextInt();
          for(int i= 0;i<size;i++)
          {
             IPizza ipizza= pizzaList.get(i);
             if(ipizza instanceof VeganPizza)
             {
                 if(((VeganPizza)ipizza).getBase()=="Thick")
                 ((VeganPizza)ipizza).setBase("Thin");
             }
              
          
          }
          Editmenu();
          }
      }
      
      if(input==3)
      {
          Editmenu();
      }

}
if(input==4)
{
      int thickCount=0,thinCount=0;
    for(IPizza ipizza:pizzaList)
    {
      if(ipizza instanceof MargaritaPizza)
      {
          MargaritaPizza margaritaPizza = (MargaritaPizza) ipizza;
          if(margaritaPizza.getBase().equals("Thick"))
          {
              thickCount++;
          }
          else
          {
              thinCount++;
          }
      }
        
    }
    System.out.println("Total Thick Base pizza = " + thickCount);
        System.out.println("Total Thin Base pizza = " + thinCount);
      System.out.println("Press 1- Edit All 2- Edit specific Number 3- Cancel ");
      input=in.nextInt();
      if(input==1)
      {
          System.out.println("Select 1- for All Thin 2- For All Thick");
          input=in.nextInt();
          for(IPizza ipizza:pizzaList)
    {
      if(ipizza instanceof MargaritaPizza)
      {
          if(input==1)
          {
              ((MargaritaPizza)ipizza).setBase("Thin");
          }
          else
          {
             ((MargaritaPizza)ipizza).setBase("Thick");
          }
      }
      }
          MainMenu();
}
      if(input==2)
      {
           System.out.println("Select 1- for Thin 2- For Thick");
          input=in.nextInt();
          if(input==1)
          {
              System.out.println("Total number of Thin Pizza = "+ thinCount);
              System.out.println("Enter number pizza want to change = ");
              size=in.nextInt();
          for(int i= 0;i<size;i++)
          {
             IPizza ipizza= pizzaList.get(i);
             if(ipizza instanceof MargaritaPizza)
             {
                 if(((MargaritaPizza)ipizza).getBase()=="Thin")
                 ((MargaritaPizza)ipizza).setBase("Thick");
             }
              
          
          }
          Editmenu();
          }
          if(input==2)
          {
              System.out.println("Total number of Thick Pizza = "+ thickCount);
              System.out.println("Enter number pizza want to change = ");
              size=in.nextInt();
          for(int i= 0;i<size;i++)
          {
             IPizza ipizza= pizzaList.get(i);
             if(ipizza instanceof MargaritaPizza)
             {
                 if(((MargaritaPizza)ipizza).getBase()=="Thick")
                 ((MargaritaPizza)ipizza).setBase("Thin");
             }
              
          
          }
          Editmenu();
          }
      }
      
      if(input==3)
      {
          Editmenu();
      }

}
if(input==5)
{
    MainMenu();
}
else{
    System.out.println("Inavlid Option");
    Editmenu();
}
}
}


//show displays ordered pizza details
public  void show(){
        System.out.println("Base");
        System.out.println(pizza.getBase());
        System.out.println("Sause");
        System.out.println(pizza.isSause());
        System.out.println("Cheese");
        System.out.println(pizza.getCheese());
        System.out.println("Flavour");
        System.out.println(pizza.getFlavour());
        Editmenu();
}


//edit function to modify pizza details
public  void edit()
{
    System.out.print("Select Item you want to edit");
    System.out.print("1- Sause");
    System.out.print("2- Base");
    System.out.print("3- Cheese");
    System.out.print("4- Flavour");
    input= in.nextInt();
    if(input==1)
    {
    System.out.print("Please enter your Sause Option \n 1- with sause \n 2- no sause \n Please Enter Option = ");
     input= in.nextInt();
    if(input==1)
    {
     pizza.setSause(true);
    }
    else if(input==2)
    {
     pizza.setSause(false);
    }
    else {
        System.out.println("Invalid Option please Select Again ");
    System.out.print("Please enter your option = ");
    input= in.nextInt();
    }
    }
    if(input==2)
    {
    System.out.print("Please enter your Base Option 1- Thick or 2- Thin = ");
     input= in.nextInt();
    if(input==1)
    {
     pizza.setBase("Thick");
    }
    else if(input==2)
    {
     pizza.setBase("Thin");
    }
    else {
        System.out.println("Invalid Option please Select Again ");
    System.out.print("Please enter your option = ");
    input= in.nextInt();
    }
    }
    if(input==3)
    {
    System.out.print("Please enter your Cheese Option 1- Mozzorella or 2- Vegan = ");
     input= in.nextInt();
    if(input==1)
    {
     pizza.setCheese("Mozorella");
    }
    else if(input==2)
    {
     pizza.setCheese("Vegan");
    }
    else {
        System.out.println("Invalid Option please Select Again ");
    System.out.print("Please enter your option = ");
    input= in.nextInt();
    }
    }
    if(input==4)
    {
    System.out.println("Please Select your Pizza");
    System.out.println("1- Chicken Pizza");
    System.out.println("2- Pepproni Pizza");
    System.out.println("3- Vegan Pizza");
    System.out.println("4- Margarita Pizza");
     input= in.nextInt();
    if(input==1)
    {
     pizza = new ChickenPizza(pizza.isSause(),pizza.getBase(),pizza.getCheese());
    }
    else if(input==2)
    {
     pizza = new PepproniPizza(pizza.isSause(),pizza.getBase(),pizza.getCheese());
    }
    else if(input==3)
    {
    pizza = new VeganPizza(pizza.isSause(),pizza.getBase(),pizza.getCheese());
    }
    else if(input==4)
    {
        pizza = new MargaritaPizza(pizza.isSause(),pizza.getBase(),pizza.getCheese());
    }
    else {
        System.out.println("Invalid Option please Select Again ");
    System.out.print("Please enter your option = ");
    input= in.nextInt();
    }

    }
    else {
        System.out.println("Invalid Option please Select Again ");
    System.out.print("Please enter your option = ");
    input= in.nextInt();
    }
    Editmenu();
}


//ViewOrders function displays a complete 
public  void ViewOrders()
{
      if(pizzaList.isEmpty())
    {
         System.out.println("No order found \nPress 1 to go Back = ");
        input = in.nextInt();
        if(input==1)
            MainMenu();
        else{
            System.out.println("Inavalid option Please Press 1 = ");
        input = in.nextInt();
        }
    }
      else {
          double chickenPrice=0,pepproniPrice=0,veganPrice=0,margaritaPrice=0;
        chickenCount=0;
        pepproniCount=0;
        veganCount=0;
        margaritaCount=0;
 for(IPizza ipizza:pizzaList)
{
 if(ipizza instanceof ChickenPizza)
 {
  chickenCount++;
  chickenPrice=ipizza.getPrice();
  
 }


 if(ipizza instanceof PepproniPizza)
 {
  pepproniCount++;
  pepproniPrice=ipizza.getPrice();
 }

 if(ipizza instanceof VeganPizza)
 {
  veganCount++;
  veganPrice=ipizza.getPrice();
 }
 if(ipizza instanceof MargaritaPizza)
 {
  margaritaCount++;
  margaritaPrice=ipizza.getPrice();
 }
}
   




int totalPrice=0;
System.out.println("Total Orders");
System.out.println("Total Chicken Pizza = " + chickenCount);
totalPrice+=chickenPrice*chickenCount;


totalPrice+=pepproniPrice*pepproniCount;
System.out.println("Total Pepproni Pizza = " + pepproniCount);


totalPrice+=veganPrice*veganCount;
System.out.println("Total Vegan Pizza = " + veganCount);

totalPrice+=margaritaPrice*margaritaCount;
System.out.println("Total Margarita Pizza = " + margaritaCount);


System.out.println("Total Order Price = " + totalPrice);


System.out.println("Press 1 Go Back");
input=in.nextInt();
if(input==1)
{
    MainMenu();
}
else {
    System.out.println("Invalid Option please Select Again ");
System.out.print("Please enter your option = ");
input= in.nextInt();
}
      }
}

public  void vieworderEdit()
{
    
System.out.println("Press 1 Add 2- Remove 3- Return");
input=in.nextInt();
if(input==1)
{
    menu("Thick","Mozzrella",true);
}
if(input==2)
{
    System.out.println("Please Select Option 1 - Remove 2- Back");
input=in.nextInt();
switch(input)
{
case 1:
    System.out.println("Enter Pizza Name you want to Remove =  ");
pizzaName=in.nextLine();
if(pizzaList.contains(pizzaName))
{
pizzaList.remove("pizzaName");
}
case 2:
ViewOrders();
default:

    System.out.println("Invalid Option please Select Again ");
System.out.print("Please enter your option = ");
input= in.nextInt();

}


}
if(input==3)
{
 ViewOrders();
}
else {
    System.out.println("Invalid Option please Select Again ");
System.out.print("Please enter your option = ");
input= in.nextInt();
}


}

public  void Search()
{
      
    boolean found=false;
    if(pizzaList.isEmpty())
    {
         System.out.println("No order found \nPress 1 to go Back = ");
        input = in.nextInt();
        if(input==1)
            MainMenu();
        else{
            System.out.println("Inavalid option Please Press 1 = ");
        input = in.nextInt();
        }
    }
    else {
        double chickenPrice=0,pepproniPrice=0,veganPrice=0,margaritaPrice=0;
      chickenCount=0;
        pepproniCount=0;
        veganCount=0;
        margaritaCount=0;
 for(IPizza ipizza:pizzaList)
{
if(ipizza instanceof ChickenPizza)
 {
  chickenCount++;
  chickenPrice=ipizza.getPrice();
  
 }


 if(ipizza instanceof PepproniPizza)
 {
  pepproniCount++;
  pepproniPrice=ipizza.getPrice();
 }

 if(ipizza instanceof VeganPizza)
 {
  veganCount++;
  veganPrice=ipizza.getPrice();
 }
 if(ipizza instanceof MargaritaPizza)
 {
  margaritaCount++;
  margaritaPrice=ipizza.getPrice();
 }
}
   

    System.out.println("Please  select Option of pizza you want to search = ");
    System.out.println("1- Chicken Pizza");
    System.out.println("2- Pepproni Pizza");
    System.out.println("3- Vegan Pizza");
    System.out.println("4- Margarita Pizza");
input=in.nextInt();
if(input==1)
{
  if(chickenCount>0)
  {
searchPrice=chickenPrice*chickenCount;
System.out.println("Total Chicken Pizza Orders \n Total Chicken Pizza = "+ chickenCount + "  Total Price  " + searchPrice);
completeOrder();
  }
  else
    {
        System.out.println("No order found");
        completeOrder();
    }
     }
 
if(input==2)
{
    if(pepproniCount>0)
    {
searchPrice=pepproniPrice*pepproniCount;
System.out.println("Total Pepproni Pizza Orders \n Total Peppronni Pizza = "+ pepproniCount + "  Total Price  " + searchPrice);
completeOrder();
    }
else
    {
        System.out.println("No order found");
        completeOrder();
    }

}
if(input==3)
{
    if(veganCount>0)
    {
    searchPrice=veganPrice*veganCount;
System.out.println("Total Vegan Pizza Orders = "+ veganCount + "  \n Total Price  " + searchPrice);
completeOrder();
    }
else
    {
        System.out.println("No order found");
        completeOrder();
    }

}
if(input==4)
{
    if(margaritaCount>0)
    {
   searchPrice=margaritaPrice*margaritaCount;
System.out.println("Total Margarita Pizza Orders \n Total Margarita Pizza = "+ margaritaCount + "  Total Price  " + searchPrice);
completeOrder();
    }
    else
    {
        System.out.println("No order found");
        completeOrder();
    }

}
else {
    System.out.println("Invalid Option please Select Again ");
System.out.print("Please enter your option = ");
input= in.nextInt();
     }
   }
 }
}
