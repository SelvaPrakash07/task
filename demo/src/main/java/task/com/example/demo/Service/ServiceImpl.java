package task.com.example.demo.Service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import task.com.example.demo.BaseResponse.BaseResponse;
import task.com.example.demo.DTO.*;
import task.com.example.demo.Model.*;
import task.com.example.demo.Repository.*;

import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;


@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    @Autowired
    private MediumRepo mediumRepo;

    @Autowired
    private SectionRepo sectionRepo;

    @Autowired
    private StaffRepo staffRepo;

    @Autowired
    private StandardRepo standardRepo;

    @Autowired
    private SubjectRepo subjectRepo;

    @Autowired
    private StandardMediumRepo standardMediumRepo;

    @Autowired
    private SubjectStaffRepo subjectStaffRepo;

    @Override
    public BaseResponse savemedium(MediumDto mediumDto) {
        BaseResponse baseResponse = new BaseResponse();
        ModelMapper modelMapper = new ModelMapper();
        Medium medium = modelMapper.map(mediumDto, Medium.class);
        mediumRepo.save(medium);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(medium);
        return baseResponse;
    }

    @Override
    public BaseResponse getAllMedium() {
        BaseResponse baseResponse = new BaseResponse();
        List<Medium> mediumList = mediumRepo.findAll();
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(mediumList);
        return baseResponse;
    }

    @Override
    public BaseResponse getMediumById(int id) {
        BaseResponse baseResponse = new BaseResponse();
        Medium medium=mediumRepo.findById(id).orElse(null);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(medium);
        return baseResponse;
    }

    @Override
    public BaseResponse updatemedium(MediumDto mediumDto) {
        BaseResponse baseResponse = new BaseResponse();
        Medium medium = mediumRepo.findById(mediumDto.getId()).orElse(null);
        medium.setId(mediumDto.getId());
        medium.setMedium(mediumDto.getMedium());
        medium.setCreatedAt(new Timestamp(new java.util.Date().getTime()));
        medium.setUpdatedAt(new Timestamp(new java.util.Date().getTime()));
        medium.setIsActive(0);
        medium.setIsDeleted(0);
        mediumRepo.save(medium);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(medium);
        return baseResponse;
    }

    @Override
    public BaseResponse IsActivemedium(MediumDto mediumDto) {
        BaseResponse baseResponse = new BaseResponse();
        Medium medium = mediumRepo.findById(mediumDto.getId()).orElse(null);
        medium.setId(mediumDto.getId());
        medium.setIsActive(1);
        mediumRepo.save(medium);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(medium);
        return baseResponse;
    }

    @Override
    public BaseResponse IsDeletedmedium(MediumDto mediumDto) {
        BaseResponse baseResponse = new BaseResponse();
        Medium medium = mediumRepo.findById(mediumDto.getId()).orElse(null);
        medium.setId(mediumDto.getId());
        medium.setIsDeleted(1);
        mediumRepo.save(medium);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(medium);
        return baseResponse;
    }

    @Override
    public BaseResponse saveSection(SectionDto sectionDto) {
        BaseResponse baseResponse = new BaseResponse();
        ModelMapper modelMapper = new ModelMapper();
        Section section = modelMapper.map(sectionDto, Section.class);
        sectionRepo.save(section);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(section);
        return baseResponse;
    }

    @Override
    public BaseResponse getAllSection() {
        BaseResponse baseResponse = new BaseResponse();
        List<Section> sectionList = sectionRepo.findAll();
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(sectionList);
        return baseResponse;
    }

    @Override
    public BaseResponse getSectionById(int id) {
        BaseResponse baseResponse = new BaseResponse();
        Section section=sectionRepo.findById(id).orElse(null);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(section);
        return baseResponse;
    }

    @Override
    public BaseResponse updatesection(SectionDto sectionDto) {
        BaseResponse baseResponse = new BaseResponse();
        Section section = sectionRepo.findById(sectionDto.getId()).orElse(null);
        section.setId(sectionDto.getId());
        section.setSectionName(sectionDto.getSectionName());
        section.setCreatedAt(new Timestamp(new java.util.Date().getTime()));
        section.setUpdatedAt(new Timestamp(new java.util.Date().getTime()));
        section.setIsActive(0);
        section.setIsDeleted(0);
        sectionRepo.save(section);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(section);
        return baseResponse;
    }

    @Override
    public BaseResponse IsActivesection(SectionDto sectionDto) {
        BaseResponse baseResponse = new BaseResponse();
        Section section = sectionRepo.findById(sectionDto.getId()).orElse(null);
        section.setId(sectionDto.getId());
        section.setIsActive(1);
        sectionRepo.save(section);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(section);
        return baseResponse;
    }

    @Override
    public BaseResponse IsDeletedSection(SectionDto sectionDto) {
        BaseResponse baseResponse = new BaseResponse();
        Section section = sectionRepo.findById(sectionDto.getId()).orElse(null);
        section.setId(sectionDto.getId());
        section.setIsDeleted(1);
        sectionRepo.save(section);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(section);
        return baseResponse;
    }

    @Override
    public BaseResponse savestaff(StaffDto staffDto) {
        BaseResponse baseResponse = new BaseResponse();
        ModelMapper modelMapper = new ModelMapper();
        Staff staff = modelMapper.map(staffDto, Staff.class);
        staffRepo.save(staff);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(staff);
        return baseResponse;
    }

    @Override
    public BaseResponse getAllStaff() {
        BaseResponse baseResponse = new BaseResponse();
        List<Staff> staffList = staffRepo.findAll();
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(staffList);
        return baseResponse;
    }

    @Override
    public BaseResponse getStaffById(int id) {
        BaseResponse baseResponse = new BaseResponse();
        Staff staff=staffRepo.findById(id).orElse(null);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(staff);
        return baseResponse;
    }

    @Override
    public BaseResponse updatestaff(StaffDto staffDto) {
        BaseResponse baseResponse = new BaseResponse();
        Staff staff = staffRepo.findById(staffDto.getId()).orElse(null);
        staff.setId(staffDto.getId());
        staff.setStaffName(staffDto.getStaffName());
        staff.setCreatedAt(new Timestamp(new java.util.Date().getTime()));
        staff.setUpdatedAt(new Timestamp(new java.util.Date().getTime()));
        staff.setIsActive(0);
        staff.setIsDeleted(0);
        staffRepo.save(staff);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(staff);
        return baseResponse;
    }

    @Override
    public BaseResponse IsActiveStaff(StaffDto staffDto) {
        BaseResponse baseResponse = new BaseResponse();
        Staff staff = staffRepo.findById(staffDto.getId()).orElse(null);
        staff.setId(staffDto.getId());
        staff.setIsActive(1);
        staffRepo.save(staff);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(staff);
        return baseResponse;
    }

    @Override
    public BaseResponse IsDeletedStaff(StaffDto staffDto) {
        BaseResponse baseResponse = new BaseResponse();
        Staff staff = staffRepo.findById(staffDto.getId()).orElse(null);
        staff.setId(staffDto.getId());
        staff.setIsDeleted(1);
        staffRepo.save(staff);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(staff);
        return baseResponse;
    }

    @Override
    public BaseResponse savestandard(StandardDto standardDto) {
        BaseResponse baseResponse = new BaseResponse();
        ModelMapper modelMapper = new ModelMapper();
        Standard standard = modelMapper.map(standardDto, Standard.class);
        standardRepo.save(standard);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(standard);
        return baseResponse;
    }

    @Override
    public BaseResponse getAllstandard() {
        BaseResponse baseResponse = new BaseResponse();
        List<Standard> standardList = standardRepo.findAll();
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(standardList);
        return baseResponse;
    }

    @Override
    public BaseResponse getStandardById(int id) {
        BaseResponse baseResponse = new BaseResponse();
        Standard standard=standardRepo.findById(id).orElse(null);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(standard);
        return baseResponse;
    }

    @Override
    public BaseResponse updatestandard(StandardDto standardDto) {
        BaseResponse baseResponse = new BaseResponse();
        Standard standard = standardRepo.findById(standardDto.getId()).orElse(null);
        standard.setId(standardDto.getId());
        standard.setName(standardDto.getName());
        standard.setCode(standardDto.getCode());
        standard.setCreatedAt(new Timestamp(new java.util.Date().getTime()));
        standard.setUpdatedAt(new Timestamp(new java.util.Date().getTime()));
        standard.setIsActive(0);
        standard.setIsDeleted(0);
        standardRepo.save(standard);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(standard);
        return baseResponse;
    }

    @Override
    public BaseResponse IsActivestandard(StandardDto standardDto) {
        BaseResponse baseResponse = new BaseResponse();
        Standard standard = standardRepo.findById(standardDto.getId()).orElse(null);
        standard.setId(standardDto.getId());
        standard.setIsActive(1);
        standardRepo.save(standard);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(standard);
        return baseResponse;
    }

    @Override
    public BaseResponse IsDeletedstandard(StandardDto standardDto) {
        BaseResponse baseResponse = new BaseResponse();
        Standard standard = standardRepo.findById(standardDto.getId()).orElse(null);
        standard.setId(standardDto.getId());
        standard.setIsDeleted(1);
        standardRepo.save(standard);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(standard);
        return baseResponse;
    }

    @Override
    public BaseResponse savesubject(SubjectDto subjectDto) {
        BaseResponse baseResponse = new BaseResponse();
        ModelMapper modelMapper = new ModelMapper();
        Subject subject = modelMapper.map(subjectDto, Subject.class);
        subjectRepo.save(subject);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(subject);
        return baseResponse;
    }

    @Override
    public BaseResponse getAllsubject() {
        BaseResponse baseResponse = new BaseResponse();
        List<Subject> subjectList = subjectRepo.findAll();
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(subjectList);
        return baseResponse;
    }

    @Override
    public BaseResponse getsubjectById(int id) {
        BaseResponse baseResponse = new BaseResponse();
        Subject subject=subjectRepo.findById(id).orElse(null);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(subject);
        return baseResponse;
    }

    @Override
    public BaseResponse updatesubject(SubjectDto subjectDto) {
        BaseResponse baseResponse = new BaseResponse();
        Subject subject = subjectRepo.findById(subjectDto.getId()).orElse(null);
        subject.setId(subjectDto.getId());
        subject.setSubjectName(subjectDto.getSubjectName());
        subject.setCreatedAt(new Timestamp(new java.util.Date().getTime()));
        subject.setUpdatedAt(new Timestamp(new java.util.Date().getTime()));
        subject.setIsActive(0);
        subject.setIsDeleted(0);
        subjectRepo.save(subject);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(subject);
        return baseResponse;
    }

    @Override
    public BaseResponse IsActivesubject(SubjectDto subjectDto) {
        BaseResponse baseResponse = new BaseResponse();
        Subject subject = subjectRepo.findById(subjectDto.getId()).orElse(null);
        subject.setId(subjectDto.getId());
        subject.setIsActive(1);
        subjectRepo.save(subject);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(subject);
        return baseResponse;
    }

    @Override
    public BaseResponse IsDeletedsubject(SubjectDto subjectDto) {
        BaseResponse baseResponse = new BaseResponse();
        Subject subject = subjectRepo.findById(subjectDto.getId()).orElse(null);
        subject.setId(subjectDto.getId());
        subject.setIsDeleted(0);
        subjectRepo.save(subject);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(subject);
        return baseResponse;
    }

    @Override
    public BaseResponse saveEverything(StandardDto standardDto) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            ModelMapper modelMapper = new ModelMapper();
            Standard standard = modelMapper.map(standardDto, Standard.class);
            standard.setCreatedAt(new Timestamp(new java.util.Date().getTime()));
            standard.setUpdatedAt(new Timestamp(new java.util.Date().getTime()));
            standard.setIsActive(0);
            standard.setIsDeleted(0);
            standardRepo.save(standard);
            saveAll(standardDto.getStandard(), standard);
            baseResponse.setStatusCode("200");
            baseResponse.setStatusMsg("sucess");
            baseResponse.setData(standard);
    } catch (Exception e) {
            e.printStackTrace();
        }


        private void saveAll(Integer[] Medium, Standard standard) {
            try {
                List<StandardMedium> standardMediumList = new LinkedList<>();
                if (Objects.nonNull(Medium) && Medium.length > 0) {
                    for (int i = 0; i < genre.length; i++) {
                        Medium medium = mediumRepo.findById(medium[i])
                                .orElseThrow(null);
                        StandardMedium standardMedium = new StandardMedium();
                        standardMedium.setStandard(standard);
                        standardMedium.setMedium1(medium);
                        standardMediumList.add(standardMedium);
                    }
                    standardMediumRepo.saveAll(standardMediumList);
                }
            }
            catch (Exception e){}
        }}

    @Override
    public BaseResponse savesubjectNdStaffDto(SubjectNdStaffDto subjectNdStaffDto) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            ModelMapper modelMapper = new ModelMapper();
            Subject subject = modelMapper.map(subjectNdStaffDto, Subject.class);
            subject.setCreatedAt(new Timestamp(new java.util.Date().getTime()));
            subject.setUpdatedAt(new Timestamp(new java.util.Date().getTime()));
            subject.setIsActive(0);
            subject.setIsDeleted(0);
            subjectRepo.save(subject);
            saveAll(subjectNdStaffDto.getStaffDtos(), subject);
            baseResponse.setStatusCode("200");
            baseResponse.setStatusMsg("sucess");
            baseResponse.setData(subject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResponse;
    }

    private void saveAll(Integer[] staff, Subject subject) {
        try {
            List<StandardMedium> standardMediumList = new LinkedList<>();
            if (Objects.nonNull(staff) && staff.length > 0) {
                for (int i = 0; i < staff.length; i++) {
                    Medium medium = mediumRepo.findById(staff[i])
                            .orElseThrow(null);
                    SubjectStaff subjectStaff = new SubjectStaff();
                    subjectStaff.setSubject(subject);
                    subjectStaff.setStaff1(staff);
                    standardMediumList.add(subjectStaff);
                }
                standardMediumRepo.saveAll(standardMediumList);
            }
        }
        catch (Exception e){}

    }}
}

