package org.application;

import java.time.LocalDate;
import org.notes.ToDoApp;

public class Main {
  public static void main(String[] args) {
    ToDoApp app = new ToDoApp();
    int id1 = app.addNote("Test", "These are my notes");
    int id2 = app.addNote("Test2", "These are my notes");
    int id3 = app.addNote("Test3", "These are my notes");
    System.out.println(app.getAllNotes());

    app.deleteNote(id1);
    app.deleteNote(id2);
    app.editNoteSummary(id3, "This is the edited note");
    app.editNoteName(id3, "New Note");
    System.out.println(app.getAllNotesByDate(LocalDate.now()));
    System.out.println(app.getAllNotes());
  }
}
