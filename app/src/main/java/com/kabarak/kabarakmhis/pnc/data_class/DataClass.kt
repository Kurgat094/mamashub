package com.kabarak.kabarakmhis.pnc.data_class

data class Child(
    val id: String,
    val name: String,
    val birthDate: String,
)

data class ChildDetail(
    val question: String,
    val answer: String,
)

data class CivilRegistration(
    val id: String,
    val name: String,
    val sexOfChild: String,
    val birthDate: String,
)
data class IPV(
    val id: String,
    val dateGiven: String,
    val nextVisit: String,
)

data class QuestionnaireDetails(
    val detailQuestion: String,
    val detailAnswer: String,
)

data class Milestone(
    val id: String,
    val visit: String,
    val age: String,
    val time: String
)

data class FamilyPlanning(
    val id: String,
    val date: String,
    val method: String,
    val weight: String,
    val bloodPressure: String,
    val remarks: String
)
