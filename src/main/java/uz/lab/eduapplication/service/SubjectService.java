package uz.lab.eduapplication.service;

import uz.lab.eduapplication.payload.ApiResponse;
import uz.lab.eduapplication.payload.SubjectDTO;

import java.util.List;
import java.util.UUID;

public interface SubjectService {
    ApiResponse<SubjectDTO> createSubject(SubjectDTO subjectDTO);
    ApiResponse<SubjectDTO> updateSubject(SubjectDTO subjectDTO);
    ApiResponse removeSubject(UUID subjectId);
    ApiResponse<List<SubjectDTO>> getSubjects();

}
