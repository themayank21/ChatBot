// chatbot using kotlin Language
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.floor

val sc = Scanner(System.`in`)


fun ringAlarm(name:String, time:Double) {
    var value:Double = time        // A local variable although there is no need but for reference
    println("Hey wake up $name its $value ")
    println("Enter a number:\n 1. Snooze \n 2. Stop")
    var num: Int = sc.nextInt()     //if you want to snooze or stop the alarm
    while (true) {
        if (num == 2) {
            println("woke")
            break
        } else if (num == 1) {
            var tim: Double = floor(value)
            value += 0.05           //there is snooze time of 5 mins
            if(value-tim >= 0.55){
                tim += 1
                value = tim
            }

            ringAlarm(name, value)
            break
        } else {
            println("Enter a valid number")
            break
        }
    }
}

fun cupOfCoffee(coffee:Int, sugar:Int){
    var cup:String? = null
    if(coffee == 1)
        cup = "Black Coffee"
    else if(coffee == 2)
        cup = "Cappuccino"
    else if(coffee == 3)
        cup = "Latte"
    println("A cup of $cup can have much benefits ")

    if(sugar>3){
        println("You need to reduce sugar amount and start dieting")
    }
}

fun heatWater(temp:Double) {

    println("($temp)f of temperature is perfect for bathing")

}

fun packbag(items:Int) {
    var arr = ArrayList<String>()
    var str:String
    println("Enter the elements to be added: ")
    for(i:Int in 1..items){
        str = sc.nextLine()
        arr.add(str)

    }

    println("Now bag consists of: ")
    for(i:String in arr){
        println(i)
    }
    while(true) {
        println("Do you want to add more elements: \n 1. Yes \n 2. No")
        var choi:Int = sc.nextInt()
        if (choi == 1) {
            str = sc.nextLine()
            arr.add(str)
            println("element added")
            continue
        }
        else if(choi == 2){
            break
        }
        else{
            println("Chose between 1 and 2")
            continue
        }
    }
}

fun breakfastAndLunch(breakfast:String, lunch:String){
    println("$breakfast is ready to serve")
    println("$lunch will be ready in 10 mins")

}

fun iron(shirt:Int, pant:Int){
    var n:Int = shirt * 2
    println("$shirt Shirts will be pressed in $n mins")
    n = pant * 3
    println("$pant Pants will be pressed in $n mins")
}

fun main() {
    println("Hello, please give me a name: ")
    val roboName:String = sc.nextLine()
    println("Enter your name: ")
    var name:String = sc.nextLine()
    println("Hello $name, $roboName can be your Personal Assistant")
    println("$roboName can perform certain tasks")
    while(true) {
        println("$roboName can perform: \n 1. Ring the Alarm \n 2. Make Coffee \n 3. Heat the Water \n 4. Pack your Bag \n 5. Cook breakfast and lunch \n 6. Iron the clothes \n 7. Quit")
        println("Choose a number between 1 to 7: ")
        var choice:Int = sc.nextInt()

        //for ringing alarm
        if(choice == 1) {
            println("Here we'll set the Alarm")
            println("Enter the day of week you need not to ring the alarm: \n 1. Monday \n 2. Tuesday \n 3. Wednesday \n 4. Thursday \n 5. Friday \n 6. Saturday \n 7. Sunday")
            var alarmDay:Int = sc.nextInt()
            println("What is today's day of the week: ")
            var alarmDayWeek:Int = sc.nextInt()
            if(alarmDayWeek == alarmDay){
                System.err.println("You paused alarm today")
                continue
            }
            println("Enter the time: ")
            var time: Double = sc.nextDouble()
            if (time >= 24.0 && time < 0.0) {
                println("Choose between 0.00 to 23.59")
            }
            ringAlarm(name, time)
        }

        //for making coffee
        else if(choice == 2){
            println("What coffee do you like: \n 1. Black Coffee \n 2. Cappuccino \n 3. Latte \n")
            var coffee:Int = sc.nextInt()
            println("How much sugar cubes do you want: ")
            var sugar:Int = sc.nextInt()

            cupOfCoffee(coffee, sugar)

        }
        //for heating the water
        else if(choice == 3) {
            println("Enter the day of week you don't want to bath: \n" +
                    " 1. Monday \n" +
                    " 2. Tuesday \n" +
                    " 3. Wednesday \n" +
                    " 4. Thursday \n" +
                    " 5. Friday \n" +
                    " 6. Saturday \n" +
                    " 7. Sunday")
            var bathDay:Int = sc.nextInt()
            println("Enter today's Day of week: ")
            var dayWeek:Int = sc.nextInt()
            if(dayWeek == bathDay){
                System.err.println("You don't bath today!!!")
                println("We recommend you to Bath daily ;)")
                continue
            }
            println("Enter the temperature(in f) of water you need: ")
            var temp:Double = sc.nextDouble()

            heatWater(temp)

        }
        //for packing your bag
        else if(choice == 4){
            println("How many things do want to keep in bag: ")
            var items:Int = sc.nextInt()

            packbag(items)
        }
        //for cooking your breakfast and lunch
        else if(choice == 5){
            println("What do you want in breakfast: ")
            var breakfast:String = sc.nextLine()
            println("What do you want in lunch: ")
            var lunch:String = sc.nextLine()

            breakfastAndLunch(breakfast, lunch)

        }
        //for ironing you clothes
        else if(choice == 6){
            println("Enter the number of Shirts you want to iron: ")
            var shirt:Int = sc.nextInt()
            println("Enter the number of Pants you want to iron: ")
            var pant:Int = sc.nextInt()

            iron(shirt, pant)

        }
        //for quitting
        else if(choice == 7){
            break
        }
        //for wrong option chosen
        else{
            println("please choose between 1 to 7")
        }

    }


}
