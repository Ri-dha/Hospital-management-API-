package com.azu.hospital.Patients.charts.sedatedPatientAssessment;

import com.azu.hospital.Patients.charts.sedatedPatientAssessment.dto.SedatedPatientAssessmentDto;
import com.azu.hospital.Patients.charts.sedatedPatientAssessment.request.SedatedPatientAssessmentRequest;
import com.azu.hospital.Patients.charts.sedatedPatientAssessment.services.SedatedPatientAssessmentService;
import com.azu.hospital.Patients.charts.sedatedPatientAssessment.services.SedatedPatientAssessmentUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/charts/sedated-patient-assessment-chart")
@CrossOrigin
@PreAuthorize("hasAnyRole('HOSPITAL_MANAGER' , 'HOSPITAL_ASSISTANCE_MANAGER' , 'DOCTOR' , 'PERMANENT' , 'NURSES' " +
        ",'NURSING_HEAD_CHIEF' , 'SURGICAL_HEAD_CHIEF' , 'INTERNAL_HEAD_CHIEF' , " +
        "'ANESTHETIC_HEAD_CHIEF' , 'PHYSICAL_THERAPY_MANAGER' , 'CHIEF_OPERATING_OFFICER' " +
        " )")
public class SedatedPatientAssessmentController {
  private final SedatedPatientAssessmentService service;
  private final SedatedPatientAssessmentUpdateService updateService;

  @Autowired
  public SedatedPatientAssessmentController(
          @Qualifier("SedatedPatientAssessmentService")
          SedatedPatientAssessmentService service,
          @Qualifier("SedatedPatientAssessmentUpdateService")
          SedatedPatientAssessmentUpdateService updateService) {
    this.service = service;
    this.updateService = updateService;
  }

  @GetMapping
  @ResponseStatus(code = HttpStatus.OK)
  public List<SedatedPatientAssessmentDto> getAllCharts(
          @RequestParam("patient_id") Long patientId
  ){
    return service.getAllPatientCharts(patientId);
  }

  @GetMapping("/{chart_id}")
  @ResponseStatus(code = HttpStatus.OK)
  public SedatedPatientAssessmentDto getChartById(
          @PathVariable("chart_id") Long chartId
  ){
    return service.getChartById(chartId);
  }

  @PostMapping
  public ResponseEntity<?> createNewChart(
          @RequestParam("patient_id") Long patientId,
          @RequestBody SedatedPatientAssessmentRequest request
          ){
    return new ResponseEntity<>(service.createNewChart(patientId, request), HttpStatus.CREATED);
  }

  @PutMapping("/{chart_id}")
  public ResponseEntity<?> updateExistsChart(
          @PathVariable("chart_id") Long chartId,
          @RequestBody SedatedPatientAssessmentRequest request
  ){
    return ResponseEntity.ok(updateService.updateExistsChart(chartId, request));
  }

}