import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String getUrl = scanner.nextLine();
        //               https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost
        String[] split1 = getUrl.split("[=?&]");

        int indexPass = -1;
        for (int i = 1; i < split1.length; i++) {
            //-> Pass section 1
            if (i != split1.length - 1 && split1[i].equals("pass") && !split1[i + 1].equals("")) {
                indexPass = i + 1;
                System.out.println(split1[i] + " : " + split1[i + 1]);
            }
            //-> Port section
            //   print if value is given
            if (i != split1.length - 1 && split1[i].equals("port") && !split1[i + 1].equals("")) {
                System.out.println(split1[i] + " : " + split1[i + 1]);
            }
            //   print if value is not present
            if ((i != split1.length - 1 && split1[i].equals("port") && split1[i + 1].equals("")) || (i == split1.length - 1 && split1[i].equals("port"))) {
                System.out.println(split1[i] + " : not found");
            }
            //-> Cookie section
            //   print if value is given
            if (i != split1.length - 1 && split1[i].equals("cookie") && !split1[i + 1].equals("")) {
                System.out.println(split1[i] + " : " + split1[i + 1]);
            }
            //  print if value is not present
            if ((i != split1.length - 1 && split1[i].equals("cookie") && split1[i + 1].equals("")) || (i == split1.length - 1 && split1[i].equals("cookie"))) {
                System.out.println(split1[i] + " : not found");
            }
            //-> Host section
            //   print if value is given
            if (i != split1.length - 1 && split1[i].equals("host") && !split1[i + 1].equals("")) {
                System.out.println(split1[i] + " : " + split1[i + 1]);
            }
            //  print if value is not present
            if ((i != split1.length - 1 && split1[i].equals("host") && split1[i + 1].equals("")) || (i == split1.length - 1 && split1[i].equals("host"))) {
                System.out.println(split1[i] + " : not found");
            }
            //-> Pass section 2
            if (i == split1.length - 1 && indexPass != -1) {
                System.out.println("password : " + split1[indexPass]);
            }
        }
    }
}

/*
You want to hack a website now. First, get all the available parameters that you can find in the URL. Then print them in the "key : value" format. If a parameter doesn't have value, print "not found".

If you find the password (parameter pass), you should print its value after all parameters once again, but with a key password. If a URL does not contain parameter pass, do not print anything after the listed parameters. However, if pass parameter is present, its value cannot be empty.

Note: the order of parameters should be the same as in the URL.
Advice: Check examples for better understanding and carefully learn the structure of the URL.

Sample Input 1:

https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost

Sample Output 1:

pass : 12345
port : 8080
cookie : not found
host : localhost
password : 12345


Sample Input 2:

https://target.com/index.html?port=8080&cookie=&host=localhost

Sample Output 2:

port : 8080
cookie : not found
host : localhost

*/