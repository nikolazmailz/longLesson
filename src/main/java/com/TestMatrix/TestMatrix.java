package com.TestMatrix;

/**
 * Created by nikk on 20.07.2017.
 */
public class TestMatrix {

    public static void main(String[] args) {

        static boolean jar;
        static private java.io.BufferedReader jin = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        static private String buf;
        static String ReadString()
        {
            try
            {
                buf = jin.readLine();
            }
            catch (java.io.IOException e)
            {
                buf = "null";
            }
            return buf;
        }
        static double ReadDouble()
        {
            double buf;
            try
            {
                buf = Double.parseDouble(jin.readLine());
            }
            catch (java.io.IOException e)
            {
                buf = 0.0;
            }
            catch(NumberFormatException e)
            {
                Print("Введены некорректные данные, повторите ввод!\n");
                buf = ReadDouble();
            }
            return buf;
        }
        static int ReadInt()
        {
            int buf;
            try
            {
                buf = Integer.parseInt(jin.readLine());
            }
            catch (java.io.IOException e)
            {
                buf = 0;
            }
            catch(NumberFormatException e)
            {
                Print("Введены некорректные данные, повторите ввод!\n");
                buf = ReadInt();
            }
            return buf;
        }
        static short ReadShort()
        {
            short buf;
            try
            {
                buf = Short.parseShort(jin.readLine());
            }
            catch (java.io.IOException e)
            {
                buf = 0;
            }
            catch(NumberFormatException e)
            {
                Print("Введены некорректные данные, повторите ввод!\n");
                buf = ReadShort();
            }
            return buf;
        }
        static byte ReadByte()
        {
            byte buf;
            try
            {
                buf = Byte.parseByte((jin.readLine()));
            }
            catch (java.io.IOException e)
            {
                buf = 0;
            }
            catch(NumberFormatException e)
            {
                Print("Введены некорректные данные, повторите ввод!\n");
                buf = ReadByte();
            }
            return buf;
        }
        static boolean ReadBool()
        {
            boolean buf1;
            try
            {
                buf = jin.readLine();
                if(Boolean.parseBoolean(buf))
                    return true;
                else
                if(buf.equalsIgnoreCase("false"))
                    return false;
                else
                    throw new Exception();
            }
            catch (Exception e)
            {
                Print("Введены некорректные данные, повторите ввод!\n");
                buf1 = ReadBool();
            }
            return buf1;
        }
        static void Print(String text)
        {
            if(jar)
                System.out.print(Repl(text));
            else
                System.out.print(text);
        }
        static void PrintLine(String text)
        {
            if(jar)
                System.out.println(Repl(text));
            else
                System.out.println(text);
        }
        static void PrintLine()
        {
            System.out.println();
        }
        static short ReadShort(short infinum, short supremum)
        {
            short buf;
            try
            {
                buf = Short.parseShort(jin.readLine());
                if(buf < infinum || buf > supremum)
                    throw new NumberFormatException();
            }
            catch (java.io.IOException e)
            {
                buf = 0;
            }
            catch(NumberFormatException e)
            {
                Print("Введены некорректные данные, повторите ввод!\n");
                buf = ReadShort(infinum, supremum);
            }
            return buf;
        }
        static byte ReadByte(byte infinum, byte supremum)
        {
            byte buf;
            try
            {
                buf = Byte.parseByte((jin.readLine()));
                if(buf < infinum || buf > supremum)
                    throw new NumberFormatException();
            }
            catch (java.io.IOException e)
            {
                buf = 0;
            }
            catch(NumberFormatException e)
            {
                Print("Введены некорректные данные, повторите ввод!\n");
                buf = ReadByte(infinum, supremum);
            }
            return buf;
        }
        static int ReadInt(int infinum, int supremum)
        {
            int buf;
            try
            {
                buf = Integer.parseInt(jin.readLine());
                if(buf < infinum || buf > supremum)
                    throw new NumberFormatException();
            }
            catch (java.io.IOException e)
            {
                buf = 0;
            }
            catch(NumberFormatException e)
            {
                Print("Введены некорректные данные, повторите ввод!\n");
                buf = ReadInt(infinum, supremum);
            }
            return buf;
        }
        static String Replace(String text)
        {
            String []LRus = {"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й",
                    "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф",
                    "х", "ц", "ч", "ш", "щ", "ь", "ы", "ъ", "э", "ю", "я" };

            String []URus = {"А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й",
                    "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф",
                    "Х", "Ц", "Ч", "Ш", "Щ", "Ь", "Ы", "Ъ", "Э", "Ю", "Я" };

            String []LEng = {"a", "b", "v", "g", "d", "e", "jo", "zh", "z", "i", "j",
                    "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f",
                    "kh", "ts", "ch", "sh", "sch", "'", "y", "'", "e", "ju", "ja" };

            String []UEng = {"A", "B", "V", "G", "D", "E", "Jo", "Zh", "Z", "I", "J",
                    "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "F",
                    "Kh", "Ts", "Ch", "Sh", "Sch", "'", "Y", "'", "E", "Ju", "Ja" };
            byte index;
            for(index = 0; index < 33; ++index)
            {
                text = text.replace(LRus[index], LEng[index]);
                text = text.replace(URus[index], UEng[index]);
            }
            return text;
        }


    }


}
