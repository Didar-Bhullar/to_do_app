package org.notes;

import java.time.LocalDate;

final public class Note {
  private int id;
  private final LocalDate date;
  private String name;
  private String noteSummary;

  Note(String name, String noteSummary) {
    this.date = LocalDate.now();
    this.name = name;
    this.noteSummary = noteSummary;
  }

  void editNoteSummary(String editedNote) {
    this.noteSummary = editedNote;
  }

  void editNoteName(String name) {
    this.name = name;
  }

  LocalDate getDate() {
    return this.date;
  }

  String getName() {
    return this.name;
  }

  String getNoteSummary() {
    return this.noteSummary;
  }

  void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return getDate().toString() + "\n" + this.id + "\n" + getName() + "\n" + getNoteSummary();
  }

}
