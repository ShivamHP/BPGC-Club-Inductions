package com.devsoc.bpgcclubinductions.models

data class Club(
    val name: String = "",
    val coordinators: List<String> = listOf(),
    val description: String = "",
    val whatsAppGrpLink: String = "",
    val imgSrc: String = "",
)
