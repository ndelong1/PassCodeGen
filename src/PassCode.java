/*------------------------------------------------------------------------------------------------
 |               Passcode generator:                                                              |
 |  This project will accept a string from the user. Then matches the length of the string to the |
 | key string. Next it will convert the string minus [spaces] into binary from the ASCII table.   |
 | Using the array of binary letters will add or multiply the binary against the binary of the key|
 | string, creating a new string using symbols and letters.                                       |
  ------------------------------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------------------------
 |    _____       _____     _____     _____      _______     _______      _______      _________  |
 |   |  __  \    /  ^  \   /  ^  \   /  ^  \    |   ____|  /  _____  \   |   __   \   |   ______| |
 |   | |__)  |  |  | |  | |  | |__| |  | |__|   |  |      |  |     |  |  |  |  \   |  |  |___     |
 |   |  ____/   |  |_|  |  \__\__    \__\__     |  |      |  |     |  |  |  |   |  |  |   ___|    |
 |   |  |       |  ___  |  __  \  \  __  \  \   |  |      |  |     |  |  |  |   |  |  |  |        |
 |   |  |       |  | |  | |  |_|  | |  |_|  |   |  |____  |  |_____|  |  |  |__/  /   |  |______  |
 |   |__|       |__| |__|  \_____/   \_____/    |_______|  \ _______ /   |_______/    |_________| |
 |                                                                                                |
 |     __ | __    __ | __    __ | __    __ | __    __ | __    __ | __    __ | __    __ | __       |
 |       / \        / \        / \        / \        / \        / \        / \        / \         |
 |                                                                                                |
 |            ______      ________    ___      __    ______      __________    ______             |
 |          /  ___   \   |   _____|  |    \   |  |  |   _   \   |   ,--,   |  |   _   \           |
 |         |  |    |__|  |  |___     |     \  |  |  |  |_ )  |  |   '__'   |  |  |_ )  |          |
 |         |  |   ____   |   ___|    |  |\  \ |  |  |       /    >   __   <   |       /           |
 |         |  |  |__  |  |  |        |  | \   v  |  |  |\  \    |   |  |   |  |  |\  \            |
 |          \  \ __|  |  |  |_____   |  |  \     |  |  | \  \   |   |__|   |  |  | \  \           |
 |           \________|  |________|  |__|   \ ___|  |__|  \__\  |__________|  |__|  \__\          |
  ------------------------------------------------------------------------------------------------*/
import java.util.Scanner;

public class PassCode {
    public static void main(String[] args){
        //----------------My Variables-------------
        String strUserInput;
        String strOutput;
        String[] binaryUI;

        //--------------User Input------------------
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string (8-16 characters long, symbols and numbers) >> ");
        strUserInput = input.nextLine();

        //create an ARRAY of the string

        //Convert each CHAR into Binary (A = 01000001)

        //From 'Key' add/subtract/multiply (randomly) Binary Arrays (stringBiArray[0] + - * keyBiArray[0])
            //STRING by the KEY  S+K, S-K, S*K


        //Convert each new binary into char print new array as string.
            //char[] a = ["H", "e", "l", "l", "o", " ", "W", "o", "r", "l", "d"];
            //String b = String(a); converts the array 'a' into a String named 'b'

    }
}
