package com.openclassrooms.notes.viewmodel

import com.openclassrooms.notes.model.Note
import com.openclassrooms.notes.repository.NotesRepository
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test

class NoteViewModelTest {

    @Test
    fun testGetNotes() {
        // Arrange
        val note1 = Note("1", "First note")
        val note2 = Note("2", "Second note")
        val mockRepository = mockk<NotesRepository>()
        val viewModel = NoteViewModel()
        val expectedNotes = listOf(note1, note2)

        coEvery { mockRepository.notes } returns flowOf(expectedNotes)

        // Act
        val actualNotes = runBlocking { viewModel.getNotes().toList() }

        // Assert
        assertEquals(expectedNotes, actualNotes.flatten())
    }
}