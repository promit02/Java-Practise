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
System.out.println("Enter the title of the book");
title=sc.nextLine();
System.out.println("Enter the publications of the book");
publications=sc.nextLine();
}
void pages()
{
System.out.println("Enter the number of pages");
pages=sc.nextInt();
}
void show()
{
System.out.println("The title of the book is:" +title);
System.out.println("The publications of the book is:" +publications);
System.out.println("The number of pages in the book is:"+pages);
}
}
class Tape extends Media
{
String runtime;
Scanner sc=new Scanner(System.in);
void read()
{
System.out.println("Enter the title of the video\n");
title=sc.nextLine();
System.out.println("Enter the publications of the video");
publications=sc.nextLine();
}
void play()
{
System.out.println("Enter the runtime of the videotape");
runtime=sc.nextLine();
}
void show()
{
System.out.println("The title of the video is:" +title);
System.out.println("The publications of the video is:" +publications);
System.out.println("The runtime of the video is:" +runtime);
}
}
class Video
{
public static void main(String args[])
{
Book bk=new Book();
Tape tp=new Tape();
bk.read();
bk.pages();
bk.show();
tp.read();
tp.play();
tp.show();
}
}
