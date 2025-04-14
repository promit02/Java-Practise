import java.util.*;
abstract class Media
{
  String title;
  String publications;
  abstract void read();
  abstract void show();

}
class Book extends Media
{
 int pages;
Scanner sc=new Scanner(System.in);
void read()
{
System.out.println("Enter the title of the book:");
title=sc.nextLine();
System.out.println("Enter the publications of the book:");
publications=sc.nextLine();
}
void pages()
{
 System.out.println("Enter the number of pages:");
 pages=sc.nextInt();
}
void show()
{
 System.out.println("The title of the book is:" +title);
System.out.println("The name of the publications is :" +publications);
System.out.println("The number of pages is:" +pages);
}
}

class Videos extends Media
{
 String runtime;
Scanner sc=new Scanner(System.in);
void read()
{
 System.out.println("Enter the title of the video:");
title=sc.nextLine();
System.out.println("Enter the publications of the video:");
publications=sc.nextLine();
}
void runtime()
{
 System.out.println("Enter the runtime of the video:");
 runtime=sc.nextLine();
}
void show()
{
 System.out.println("The title of the video is:" +title);
System.out.println("The name of the publications is :" +publications);
System.out.println("The runtime is:" +runtime);
}
}


class Mediainherit
{
public static void main(String args[])
{
 Book bk=new Book();
 bk.read();
bk.pages();
bk.show();
Videos vc=new Videos();
vc.read();
vc.runtime();
vc.show();
}
}

