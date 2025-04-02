import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Files {
    public int[] fileToIntArray(String fileName){
        File file; //mayuscula clasee minuscula variable. Apunta a un archivo fisico del disco duro
        FileReader reader;//llave con permiso de solo lectura
        BufferedReader bufer;//para recuperar informacion del archivo
        String linea;//una linea de archivo
        int[] array = null;//arreglo de numeros resultantes
        int i = 0;//indice
        int t; //tamaño del arreglo
        try{
            t = countFilesLines(fileName);
            array = new int[t];
            file = new File("C:\\archivos\\" + fileName);
            reader = new FileReader(file);
            bufer = new BufferedReader(reader);
        }catch(Exception e){
            System.out.println("Error al leer el archivo: " + e.toString());
        }
    }
}