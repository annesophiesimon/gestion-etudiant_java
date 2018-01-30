package swingexemple;

public class Slide {

String tabImage [] = {"/home/anneso/Téléchargements/img1.jpg",
					  "/home/anneso/Téléchargements/img2.jpg",
					  "/home/anneso/Téléchargements/img3.jpg",
					   "/home/anneso/Téléchargements/img4.jpg"};
String image;

public String slideImage(int x) {

	image = tabImage[x];
	
	return image;
}


}
