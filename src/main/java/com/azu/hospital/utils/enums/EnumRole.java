package com.azu.hospital.utils.enums;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;

public enum EnumRole {
    ACCOUNTANT,
    ACCOUNTING_CLERK,
    ACCOUNTING_MANAGER,
    ACCOUNT_EXECUTIVE,
    ACCOUNT_MANAGER,
    ADMINISTRATIVE,
    ADMINISTRATION_MEMBER,
    ADMINISTRATIVE_ASSISTANT,
    ADMINISTRATIVE_MANAGER,
    ADMINISTRATIVE_MEDICAL_ASSISTANT,
    ADMISSIONS_DIRECTOR,
    ALLERGIST_IMMUNOLOGIST,
    AMBULATORY_NURSE,
    ANESTHESIOLOGIST,
    ANESTHETIC_HEAD_CHIEF,
    ANESTHETIST_ASSISTANT,
    ANESTHETIST_TECHNICAL,
    ASSISTANT_ADMINISTRATOR,
    ASSISTANT_DIRECTOR_OF_NURSING,
    AUDIOLOGIST,
    BIOMEDICAL_ENGINEER,
    BUSINESS_ANALYST,
    CARDIAC_CATHETERIZATION_LAB_NURSE,
    CARDIOLOGIST,
    CARDIOVASCULAR_OPERATING_ROOM_NURSE,
    CARDIOVASCULAR_TECHNOLOGIST,
    CERTIFIED_NURSING_ASSISTANT,
    CHIEF_FINANCIAL_OFFICER,
    CHIEF_OPERATING_OFFICER,
    CLEANER,
    CLINICAL_LIAISON,
    CLINICAL_NURSE_MANAGER,
    CLINICAL_REVIEWER,
    CLINICAL_SPECIALIST,
    COMPUTER_PROGRAMMER,
    CONSULTANT,
    CUSTOMER_SERVICE_REPRESENTATIVE,
    CYSTOTECHNOLOGIST,
    DENTAL_ASSISTANT,
    DENTAL_HYGIENIST,
    DENTAL_LAB_TECHNICIAN,
    DENTIST,
    DEPARTMENT_MANAGER,
    DEPARTMENT_MANAGER_ASSISTANT,
    DERMATOLOGIST,
    DERMATOLOGY_NURSE,
    DIAGNOSTIC_MEDICAL_SONOGRAPHER_SPECIALIST,
    DIALYSIS_NURSE,
    DIRECTOR_OF_NURSING,
    DIRECTOR_OF_REHABILITATION,
    DOCTOR,
    EMERGENCY_ROOM_NURSE,
    ENDOCRINOLOGIST,
    ENDOSCOPY_NURSE,
    EXECUTIVE_ASSISTANT,
    EXECUTIVE_DIRECTOR,
    EXERCISE_PHYSIOLOGIST,
    FAMILY_NURSE_PRACTITIONER,
    FAMILY_PHYSICIAN,
    FINANCIAL_ANALYST,
    FRONT_OFFICE_CLERK,
    GASTROENTEROLOGIST,
    GENETICIST,
    HEALTHCARE_ADMINISTRATOR,
    HEALTHCARE_MANAGEMENT,
    HEALTHCARE_SPECIALIST,
    HEALTH_EDUCATOR,
    HEALTH_FACILITIES_SURVEYOR,
    HEALTH_SERVICES_MANAGER,
    HEMATOLOGIST,
    HOSPICE_ADMINISTRATOR,
    HOSPICE_AIDE,
    HOSPICE_AND_PALLIATIVE_MEDICINE_SPECIALIST,
    HOSPITAL_ASSISTANCE_MANAGER,
    HOSPITAL_MANAGER,
    HUMAN_RESOURCES_MANAGER,
    HUMAN_RESOURCE_SPECIALIST,
    INFECTIOUS_DISEASE_PHYSICIAN,
    INFORMATION_TECHNOLOGY_MANAGER,
    INFORMATION_TECHNOLOGY_SPECIALIST,
    INTENSIVE_CARE_NURSE,
    INTERNAL_HEAD_CHIEF,
    INTERNAL_MEDICINE,
    INVENTORY_CLERK,
    LABORATORY,
    LAB_ANALYST,
    LAB_TECHNICAL,
    LICENSED_PRACTICAL_NURSE,
    MANAGER_OF_OFFICE_MANAGER,
    MASSAGE_THERAPIST,
    MEDICAL_ADMINISTRATIVE,
    MEDICAL_ASSISTANT,
    MEDICAL_ASSOCIATE,
    MEDICAL_BILLING_SPECIALIST,
    MEDICAL_CLAIMS_AND_BILLING_SPECIALIST,
    MEDICAL_OFFICE_ASSISTANT,
    MEDICAL_OFFICE_MANAGER,
    MEDICAL_OFFICE_SPECIALIST,
    MEDICAL_OR_HEALTH_SERVICES_MANAGER,
    MEDICAL_RECORDS_DIRECTOR,
    MEDICAL_SURGERY_NURSE,
    MOBILE_DIRECTOR_OF_NURSING_SERVICES,
    MRI_TECHNOLOGIST,
    NEONATAL_INTENSIVE_CARE_NURSE,
    NEPHROLOGIST,
    NEUROLOGIST,
    NURSES,
    NURSE_AIDE,
    NURSE_CLINICAL_EDUCATOR,
    NURSE_CONSULTANT,
    NURSE_INFORMATICS_ANALYST,
    NURSE_MANAGER,
    NURSE_MIDWIFE,
    NURSE_PARALEGAL,
    NURSE_PRACTITIONER,
    NURSING_ASSISTANT,
    NURSING_HEAD_CHIEF,
    NURSING_HEAD_CHIEF_ASSISTANT,
    NURSING_HOME_ADMINISTRATOR,
    NURSING_STAFF_CHIEF,
    NURSING_STAFF_CHIEF_ASSISTANT,
    NUTRITIONIST,
    OBSTETRICIAN_GYNECOLOGIST,
    OCCUPATIONAL_HEALTH_AND_SAFETY_SPECIALIST,
    OCCUPATIONAL_HEALTH_NURSE,
    OCCUPATIONAL_THERAPIST,
    OFFICE_ASSISTANT,
    OFFICE_CLERK,
    ONCOLOGIST,
    ONCOLOGY_NURSE,
    OPERATING_ROOM_NURSE,
    OPERATIONS_MANAGER,
    OPHTHALMOLOGIST,
    OPTOMETRIST,
    ORTHOPEDIST,
    OSTEOPATH,
    OTOLARYNGOLOGIST,
    PARAMEDIC,
    PATHOLOGIST,
    PATIENT_ACCESS_SUPERVISOR,
    PATIENT_CARE_ASSOCIATE,
    PATIENT_SERVICES_REPRESENTATIVE,
    PATIENT_SERVICES_TECHNICIAN,
    PEDIATRICIAN,
    PEDIATRIC_INTENSIVE_CARE_NURSE,
    PEDIATRIC_NURSE,
    PEDIATRIC_NURSE_PRACTITIONER,
    PERMANENT,
    PHARMACEUTICAL_SALES,
    PHARMACEUTICAL_SALES_REPRESENTATIVE,
    PHARMACISTS,
    PHARMACISTS_ASSISTANT,
    PHARMACY_CLERK,
    PHYSICAL_THERAPIST,
    PHYSICAL_THERAPIST_ASSISTANT,
    PHYSICAL_THERAPY_ASSISTANT,
    PHYSICAL_THERAPY_MANAGER,
    PHYSICIAN_AIDE,
    PHYSICIAN_ASSISTANT,
    PHYSICIAN_EXECUTIVE,
    PLASTIC_SURGEON,
    PODIATRIST,
    POST_ANESTHESIA_NURSE,
    PROGRESSIVE_CARE_NURSE,
    PSYCHIATRIC_AIDE,
    PSYCHIATRIC_NURSE,
    PSYCHIATRIC_NURSE_PRACTITIONER,
    PSYCHIATRIST,
    PUBLIC_HEALTH_NURSE,
    PULMONOLOGIST,
    RADIATION_THERAPIST,
    RADIOLOGIST,
    RECEPTIONIST,
    RECREATIONAL_THERAPIST,
    REGIONAL_SALES_MANAGER,
    REGISTERED_NURSE,
    RHEUMATOLOGIST,
    SECRETARY,
    SECURITY_GUARD,
    SLEEP_MEDICINE_SPECIALIST,
    SURGEON,
    SURGICAL_HEAD_CHIEF,
    UROLOGIST,
    WARD_MANAGER,
    WARD_MANAGER_ASSISTANT,
    ACADEMIC_ADVISOR,
    ADMINISTRATIVE_CLERK,
    ACCOUNTING_SUPERVISOR,
    ACCOUNTING_SPECIALIST,
    ACCOUNTING_ASSISTANT,
    BUILDING_CODE_ADMINISTRATOR,
    BUILDING_MAINTENANCE_MANAGER,
    BUILDING_PLANS_EXAMINER,
    BUILDING_SYSTEMS_CONTROLS_TECHNICIAN,
    CAREER_COUNSELOR,
    ERP_ANALYST,
    EXECUTIVE_ADMINISTRATIVE_SPECIALIST,
    LEAD_TELECOM_TECHNOLOGY_SPECIALIST,
    MANAGER_OF_LAW_UNIT,
    ASSISTANT_OF_MANAGER_OF_LAW_UNIT,
    SR_ELECTRICAL_ENGINEER,
    DIRECTOR_OF_THE_LEGAL_UNIT,
    ASSISTANT_DIRECTOR_OF_THE_LEGAL_UNIT,
    LEGAL_ADMINISTRATIVE,
    MAINTENANCE_ENGINEER,
    PLUMBING_ENGINEER,
    ELECTRONIC_ENGINEER,
    DIRECTOR_OF_MAINTENANCE_DIVISION,
    ASSISTANT_DIRECTOR_OF_MAINTENANCE_DIVISION,
    HOTEL_SERVICES_MANAGER,
    SERVICE_MANAGER,
    ASSISTANT_DIRECTOR_OF_SERVICES,
    ASSISTANT_DIRECTOR_OF_HOTEL_SERVICES,
    DIRECTOR_OF_THE_ADMINISTRATIVE_DIVISION,
    DIRECTOR_OF_THE_ELECTRONIC_ARCHIVING_UNIT,
    DIRECTOR_OF_THE_TECHNICAL_DEPARTMENT,
    ASSISTANT_DIRECTOR_OF_THE_TECHNICAL_DEPARTMENT,
    DIRECTOR_OF_THE_PHARMACY_DIVISION,
    ASSISTANT_DIRECTOR_OF_THE_PHARMACY_DIVISION,
    DIRECTOR_OF_THE_RADIATION_DIVISION,
    ASSISTANT_DIRECTOR_OF_THE_RADIATION_DIVISION,
    DIRECTOR_OF_THE_LABORATORY_DIVISION,
    ASSISTANT_DIRECTOR_OF_THE_LABORATORY_DIVISION,
    LABORATORY_BACTERIOLOGY

    ;


    public String getName() {
        return this.name();
    }

    public List<SimpleGrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_" + this.name()));
    }

    ;

}
