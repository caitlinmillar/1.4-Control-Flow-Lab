import java.util.Scanner;

class WhatToWear {
    Scanner scanner = new Scanner(System.in);
    WhatToWear() {
        {int temperatureInput = scanner.nextInt();
            String weather = scanner.next();
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("What's the temperature today in ˚C?");


        int temperatureInput = reader.nextInt();
        reader.nextLine();

        var coldInput = "Make sure you wear a coat and wrap up warm.";
        var hotInput = "Bring a hat and wear light clothes.";

        if (temperatureInput <=18){
            System.out.print(coldInput);
        }
        else if (temperatureInput > 19){
            System.out.print(hotInput);
        }
        String rain = "raining";
        String sun ="sunny";
        var rainInput = "Don't forget your umbrella!";
        var sunInput = "Grab a hat and some suncream!";
        {
            Scanner weather = new Scanner(System.in);
            System.out.println(" Is it raining or sunny?");
            String weatherInput = reader.next();
            reader.nextLine();
            if (weatherInput.equals(sun)){
                System.out.println(sunInput);
            }
            else if (weatherInput.equals(rain)) {
                System.out.println(rainInput);
            }




        }
    }}

