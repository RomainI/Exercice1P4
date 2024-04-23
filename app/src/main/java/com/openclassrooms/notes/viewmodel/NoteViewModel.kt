package com.openclassrooms.notes.viewmodel

import androidx.lifecycle.ViewModel
import com.openclassrooms.notes.model.Note
import com.openclassrooms.notes.repository.NotesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
open class NoteViewModel() : ViewModel() {

    @Inject
    private var notesRepository = NotesRepository()


     open fun getNotes(): Flow<List<Note>> {
         return notesRepository.notes
     }

    fun addNotes(note: Note){
//TODO
    }
}
