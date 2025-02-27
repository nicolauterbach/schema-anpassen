package de.nordlb.kafka.specification.schema.validation;

import java.nio.file.Files;
import java.nio.file.Paths;

public class SchemaReader {
    public static void main(String[] args) {
        try {
            // Lese den Inhalt der Datei "uploaded_schema.txt" als String
            String schemaContent = Files.readString(Paths.get("uploaded_schema.txt"));
            System.out.println("Ausgelesenes Schema:");
            System.out.println(schemaContent);
        } catch (Exception e) {
            System.err.println("Fehler beim Einlesen der Datei: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
