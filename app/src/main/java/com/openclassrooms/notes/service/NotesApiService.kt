package com.openclassrooms.notes.service

import com.openclassrooms.notes.model.Note

/**
 * Defines the contract for the API that manages the notes
 */
interface NotesApiService {

    /**
     * Returns all the notes
     * @return the list of notes
     */
    fun getAllNotes(): List<Note>

}