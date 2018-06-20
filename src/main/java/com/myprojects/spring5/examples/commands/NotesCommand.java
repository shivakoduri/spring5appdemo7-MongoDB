package com.myprojects.spring5.examples.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NotesCommand {

    private String id;
    private String recipeNotes;
}
