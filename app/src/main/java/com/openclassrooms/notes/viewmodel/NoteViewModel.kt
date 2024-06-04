package com.openclassrooms.notes.viewmodel

import androidx.lifecycle.ViewModel
import com.openclassrooms.notes.model.Note
import com.openclassrooms.notes.repository.NotesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NoteViewModel @Inject constructor(
    private val notesRepository: NotesRepository
) : ViewModel() {

    fun getNotes(): Flow<List<Note>> {
         return notesRepository.notes
     }

}
