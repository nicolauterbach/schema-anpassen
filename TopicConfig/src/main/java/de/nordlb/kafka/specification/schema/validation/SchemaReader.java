package de.nordlb.kafka.specification.schema.validation;

import java.nio.file.Files;
import java.nio.file.Paths;

public class SchemaReader {
    public static void main(String[] args) {
        try {
            // Ohne "TopicConfig/" da der Working Directory bereits TopicConfig ist
            String schemaContent = Files.readString(Paths.get("uploaded_schema.avsc"));
            System.out.println("Ausgelesenes Schema:");
            System.out.println(schemaContent);
        } catch (Exception e) {
            System.err.println("Fehler beim Einlesen der Datei: " + e.getMessage());
            e.printStackTrace();
        }
    }
}