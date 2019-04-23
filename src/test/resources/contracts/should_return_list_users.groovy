import org.springframework.cloud.contract.spec.Contract

[Contract.make {
    description "should return list of users for id 1"
    request {
        url "/users/1"
        method GET()

    }
    response {
        status 201
        body(["apple1", "orange1"])
    }
},
 Contract.make {
     description "should return list of users for id 2"
     request {
         url "/users/2"
         method GET()

     }
     response {
         status 201
         body(["apple2", "orange2"])
     }
 }
]

