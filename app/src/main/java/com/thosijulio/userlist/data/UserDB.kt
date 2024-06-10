package com.thosijulio.userlist.data

import com.thosijulio.userlist.R
import com.thosijulio.userlist.data.model.User

object UserDB {
    private val users = listOf(
        User(
            id = 1,
            image = R.drawable.user_1,
            name = "Ana Clara",
            email = "ana.clara@example.com",
            age = 25,
            birthDate = "15/04/1998",
            address = "Rua das Flores, 123, São Paulo, SP",
            phone = "(11) 98765-4321"
        ),
        User(
            id = 2,
            image = R.drawable.user_2,
            name = "Beatriz Silva",
            email = "beatriz.silva@example.com",
            age = 30,
            birthDate = "25/08/1993",
            address = "Avenida Paulista, 456, São Paulo, SP",
            phone = "(11) 91234-5678"
        ),
        User(
            id = 3,
            image = R.drawable.user_3,
            name = "Carla Souza",
            email = "carla.souza@example.com",
            age = 28,
            birthDate = "12/02/1995",
            address = "Rua dos Limoeiros, 789, Rio de Janeiro, RJ",
            phone = "(21) 99876-5432"
        ),
        User(
            id = 4,
            image = R.drawable.user_4,
            name = "Daniela Pereira",
            email = "daniela.pereira@example.com",
            age = 27,
            birthDate = "30/06/1996",
            address = "Avenida Atlântica, 101, Rio de Janeiro, RJ",
            phone = "(21) 98765-4321"
        ),
        User(
            id = 5,
            image = R.drawable.user_5,
            name = "Elisa Costa",
            email = "elisa.costa@example.com",
            age = 22,
            birthDate = "05/11/2001",
            address = "Rua das Palmeiras, 202, Belo Horizonte, MG",
            phone = "(31) 91234-5678"
        ),
        User(
            id = 6,
            image = R.drawable.user_6,
            name = "Fernanda Lima",
            email = "fernanda.lima@example.com",
            age = 26,
            birthDate = "18/03/1997",
            address = "Avenida dos Andradas, 303, Belo Horizonte, MG",
            phone = "(31) 99876-5432"
        ),
        User(
            id = 7,
            image = R.drawable.user_7,
            name = "Gabriela Alves",
            email = "gabriela.alves@example.com",
            age = 24,
            birthDate = "22/07/1999",
            address = "Rua do Sol, 404, Curitiba, PR",
            phone = "(41) 98765-4321"
        ),
        User(
            id = 8,
            image = R.drawable.user_8,
            name = "Helena Rocha",
            email = "helena.rocha@example.com",
            age = 29,
            birthDate = "09/01/1994",
            address = "Avenida Batel, 505, Curitiba, PR",
            phone = "(41) 91234-5678"
        ),
        User(
            id = 9,
            image = R.drawable.user_9,
            name = "Isabela Santos",
            email = "isabela.santos@example.com",
            age = 23,
            birthDate = "16/05/2000",
            address = "Rua das Acácias, 606, Porto Alegre, RS",
            phone = "(51) 99876-5432"
        ),
        User(
            id = 10,
            image = R.drawable.user_10,
            name = "Julia Martins",
            email = "julia.martins@example.com",
            age = 31,
            birthDate = "28/10/1992",
            address = "Avenida Ipiranga, 707, Porto Alegre, RS",
            phone = "(51) 98765-4321"
        ),
        User(
            id = 11,
            image = R.drawable.user_11,
            name = "Larissa Fernandes",
            email = "larissa.fernandes@example.com",
            age = 27,
            birthDate = "02/04/1996",
            address = "Rua das Orquídeas, 808, Salvador, BA",
            phone = "(71) 91234-5678"
        ),
        User(
            id = 12,
            image = R.drawable.user_12,
            name = "Mariana Oliveira",
            email = "mariana.oliveira@example.com",
            age = 25,
            birthDate = "19/12/1998",
            address = "Avenida Sete de Setembro, 909, Salvador, BA",
            phone = "(71) 99876-5432"
        ),
        User(
            id = 13,
            image = R.drawable.user_13,
            name = "Nathalia Gomes",
            email = "nathalia.gomes@example.com",
            age = 28,
            birthDate = "11/09/1995",
            address = "Rua da Paz, 1010, Fortaleza, CE",
            phone = "(85) 98765-4321"
        ),
        User(
            id = 14,
            image = R.drawable.user_14,
            name = "Olivia Souza",
            email = "olivia.souza@example.com",
            age = 24,
            birthDate = "25/01/1999",
            address = "Avenida Beira Mar, 111, Fortaleza, CE",
            phone = "(85) 91234-5678"
        ),
        User(
            id = 15,
            image = R.drawable.user_15,
            name = "Patricia Lima",
            email = "patricia.lima@example.com",
            age = 26,
            birthDate = "14/06/1997",
            address = "Rua das Amendoeiras, 1212, Recife, PE",
            phone = "(81) 99876-5432"
        )
    )

    fun getAllUsers(): List<User> = users

    fun getUserById(id: Int): User? = users.find { it.id == id }
}