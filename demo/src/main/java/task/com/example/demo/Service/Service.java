package task.com.example.demo.Service;

import task.com.example.demo.BaseResponse.BaseResponse;
import task.com.example.demo.DTO.*;
import task.com.example.demo.Model.Medium;

public interface Service {

    BaseResponse savemedium(MediumDto mediumDto);

    BaseResponse getAllMedium();

    BaseResponse getMediumById(int id);

    BaseResponse updatemedium(MediumDto mediumDto);

    BaseResponse IsActivemedium(MediumDto mediumDto);

    BaseResponse IsDeletedmedium(MediumDto mediumDto);

    BaseResponse saveSection(SectionDto sectionDto);

    BaseResponse getAllSection();

    BaseResponse getSectionById(int id);

    BaseResponse updatesection(SectionDto sectionDto);

    BaseResponse IsActivesection(SectionDto sectionDto);

    BaseResponse IsDeletedSection(SectionDto sectionDto);

    BaseResponse savestaff(StaffDto staffDto);

    BaseResponse getAllStaff();

    BaseResponse getStaffById(int id);

    BaseResponse updatestaff(StaffDto staffDto);

    BaseResponse IsActiveStaff(StaffDto staffDto);

    BaseResponse IsDeletedStaff(StaffDto staffDto);

    BaseResponse savestandard(StandardDto standardDto);

    BaseResponse getAllstandard();

    BaseResponse getStandardById(int id);

    BaseResponse updatestandard(StandardDto standardDto);

    BaseResponse IsActivestandard(StandardDto standardDto);

    BaseResponse IsDeletedstandard(StandardDto standardDto);

    BaseResponse savesubject(SubjectDto subjectDto);

    BaseResponse getAllsubject();

    BaseResponse getsubjectById(int id);

    BaseResponse updatesubject(SubjectDto subjectDto);

    BaseResponse IsActivesubject(SubjectDto subjectDto);

    BaseResponse IsDeletedsubject(SubjectDto subjectDto);

    BaseResponse saveEverything(StandardDto standardDto);

    BaseResponse savesubjectNdStaffDto(SubjectNdStaffDto subjectNdStaffDto);
}
