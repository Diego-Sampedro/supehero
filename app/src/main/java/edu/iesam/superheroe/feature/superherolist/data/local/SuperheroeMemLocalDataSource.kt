package edu.iesam.superheroe.feature.superherolist.data.local

import edu.iesam.superheroe.feature.superherolist.domain.Superheroe

class SuperheroeMemLocalDataSource {

    private val localSuperheroe = mutableListOf<Superheroe>(
        Superheroe(
            "Superman",
            "Superman",
            "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/fb6a00b4-9cdc-401d-9a61-41fdbe9d09ce/dfmkytl-ccdc4a9a-0e1b-4590-afd8-9bb455c53060.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiIvZi9mYjZhMDBiNC05Y2RjLTQwMWQtOWE2MS00MWZkYmU5ZDA5Y2UvZGZta3l0bC1jY2RjNGE5YS0wZTFiLTQ1OTAtYWZkOC05YmI0NTVjNTMwNjAucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.wx1bRDeT4UF-Opo0uwMaF2yjiZVNjk2vQGeMWhbo_o0"
        ),
        Superheroe(
            "Spider-man",
            "Spider-man",
            "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/6fc82fe7-e04c-4d7f-9ed3-3e3df6a42b38/ddl3lw6-9ae2bef4-a642-467c-a021-8668d9846fcd.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiIvZi82ZmM4MmZlNy1lMDRjLTRkN2YtOWVkMy0zZTNkZjZhNDJiMzgvZGRsM2x3Ni05YWUyYmVmNC1hNjQyLTQ2N2MtYTAyMS04NjY4ZDk4NDZmY2QucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.kjtLYQpqGnqMRKVRRY-1tITI_lkK9bsBLdwDLrE-2xo"
        ),
        Superheroe(
            "Iron Man",
            "Iron_man",
            "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/84f6d3c7-19b3-471c-99b3-ebe943ca814d/diyjghh-1b2804cb-95ef-4719-ba88-307d9fc4390d.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiIvZi84NGY2ZDNjNy0xOWIzLTQ3MWMtOTliMy1lYmU5NDNjYTgxNGQvZGl5amdoaC0xYjI4MDRjYi05NWVmLTQ3MTktYmE4OC0zMDdkOWZjNDM5MGQucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.S6bRnvWbH40GncJ6WDM6Cku-5Qrm9wA95Gzfqj3eVJ0"
        ),
        Superheroe(
            "Batman",
            "Batman",
            "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/b4bba41e-2420-42ec-8c4f-95844dd273dc/dkfkwpl-033aa778-b5a5-4759-8a30-0137c1d185b3.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiIvZi9iNGJiYTQxZS0yNDIwLTQyZWMtOGM0Zi05NTg0NGRkMjczZGMvZGtma3dwbC0wMzNhYTc3OC1iNWE1LTQ3NTktOGEzMC0wMTM3YzFkMTg1YjMucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.4YlMk5Knwmz2TIw1OT4gHsIp-5_hdk846Gbv55sf4AU"
        ),
        Superheroe(
            "Wonder Woman",
            "Wonder_Woman",
            "https://preview.redd.it/absolute-wonder-woman-dc-render-v0-1q4ji34qi5xf1.png?width=1080&crop=smart&auto=webp&s=4eb1c5b74a9ae97f9173badd16b489fc17e865a3"
        ),
        Superheroe(
            "Captain America",
            "Captain_America",
            "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/b4bba41e-2420-42ec-8c4f-95844dd273dc/dmhvfyt-230163e8-05cc-4b9b-886b-921c9c1725ec.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiIvZi9iNGJiYTQxZS0yNDIwLTQyZWMtOGM0Zi05NTg0NGRkMjczZGMvZG1odmZ5dC0yMzAxNjNlOC0wNWNjLTRiOWItODg2Yi05MjFjOWMxNzI1ZWMucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.Sn8TJL1_MzXqQx5g0xW0P7NNelYYyu2SDgAibh3lS9Q"
        ),
        Superheroe(
            "Thor",
            "Thor",
            "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/94214084-778b-4031-b1da-934bcadaa9c6/dgyph94-1fd2eb0c-aec3-4555-9539-9b36b6ad2025.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiIvZi85NDIxNDA4NC03NzhiLTQwMzEtYjFkYS05MzRiY2FkYWE5YzYvZGd5cGg5NC0xZmQyZWIwYy1hZWMzLTQ1NTUtOTUzOS05YjM2YjZhZDIwMjUucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.UK8v6tfipArXRwbKvw6gRSFUp8sPCTfN3-cs1Jqf4PU"
        ),
        Superheroe(
            "Hulk",
            "Hulk",
            "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/94214084-778b-4031-b1da-934bcadaa9c6/dgyotx0-a846cfac-4b3b-48a5-82a4-05922629e6e2.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiIvZi85NDIxNDA4NC03NzhiLTQwMzEtYjFkYS05MzRiY2FkYWE5YzYvZGd5b3R4MC1hODQ2Y2ZhYy00YjNiLTQ4YTUtODJhNC0wNTkyMjYyOWU2ZTIucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.vnUZkzcRpW2Y0T5g9rRTww22P83C1xK_xO6UKR7rrA8"
        ),
        Superheroe(
            "Black Panther",
            "Black_Panther",
            "https://static.wikia.nocookie.net/vsbattles/images/b/b8/Captain_america_civil_war_black_panther_01_png_by_imangelpeabody-d9xd4gp.png/revision/latest/scale-to-width-down/350?cb=20160708211641"
        ),
        Superheroe(
            "Flash",
            "Flash",
            "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/d01a21a6-c7c4-4b9a-94eb-5fe739da0608/d52fzst-6ddfc66e-13dd-4482-8504-09f153581155.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiIvZi9kMDFhMjFhNi1jN2M0LTRiOWEtOTRlYi01ZmU3MzlkYTA2MDgvZDUyZnpzdC02ZGRmYzY2ZS0xM2RkLTQ0ODItODUwNC0wOWYxNTM1ODExNTUucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.kAIx-zyhvo6fV2JXAMA2u927cl-0xgWpoUKfwR4Wevg"
        ),
        Superheroe(
            "Green Lantern",
            "Green_Lantern",
            "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/6c97c05e-4803-406f-9a76-e27903e6cad2/dfoqhba-3503c7cc-9c0a-48f3-bf02-16ea83acb83d.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiIvZi82Yzk3YzA1ZS00ODAzLTQwNmYtOWE3Ni1lMjc5MDNlNmNhZDIvZGZvcWhiYS0zNTAzYzdjYy05YzBhLTQ4ZjMtYmYwMi0xNmVhODNhY2I4M2QucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.lz1A05JRduENav3DFDt_c5rQVdzJy3iQKFG6V8L6q64"
        ),
        Superheroe(
            "Aquaman",
            "Aquaman",
            "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/2c94c1fb-72e2-4933-bb73-55b09c58bd6d/dhuf3mf-e509cc04-0a1a-43be-a3de-b980f4d33cf3.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiIvZi8yYzk0YzFmYi03MmUyLTQ5MzMtYmI3My01NWIwOWM1OGJkNmQvZGh1ZjNtZi1lNTA5Y2MwNC0wYTFhLTQzYmUtYTNkZS1iOTgwZjRkMzNjZjMucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.4hz26j9rmn5-mi11VpjUXuqc7Z48TtRFKpy2qyMkN8I"
        ),
        Superheroe(
            "Wolverine",
            "Wolverine",
            "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/fb6a00b4-9cdc-401d-9a61-41fdbe9d09ce/dfqnuk8-f9c80513-ecf5-42f0-b9f7-f9c61cf0a1e7.png/v1/fill/w_1280,h_1983/wolverine_render__by_yessing_dfqnuk8-fullview.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MTk4MyIsInBhdGgiOiIvZi9mYjZhMDBiNC05Y2RjLTQwMWQtOWE2MS00MWZkYmU5ZDA5Y2UvZGZxbnVrOC1mOWM4MDUxMy1lY2Y1LTQyZjAtYjlmNy1mOWM2MWNmMGExZTcucG5nIiwid2lkdGgiOiI8PTEyODAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.HtG_vXJZI-WkFVhmRZKG_a6K-Xwu7LAx4IPupDPaMEw"
        ),
        Superheroe(
            "Deadpool",
            "Deadpool",
            "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/133793cf-116c-4ea5-a30f-20e3dc430d17/d97lqtq-0fd48426-fd21-4f4b-83ce-172148fb04d5.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiIvZi8xMzM3OTNjZi0xMTZjLTRlYTUtYTMwZi0yMGUzZGM0MzBkMTcvZDk3bHF0cS0wZmQ0ODQyNi1mZDIxLTRmNGItODNjZS0xNzIxNDhmYjA0ZDUucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.JKRhuiFF49_caU2fwwYqbVgkQnQNTWi3BoUF0UagOfs"
        ),
        Superheroe(
            "Doctor Strange",
            "Doctor_Strange",
            "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/84f6d3c7-19b3-471c-99b3-ebe943ca814d/dj3nc0e-646a0ca3-41d6-43b9-95cc-f6a66ed2db06.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiIvZi84NGY2ZDNjNy0xOWIzLTQ3MWMtOTliMy1lYmU5NDNjYTgxNGQvZGozbmMwZS02NDZhMGNhMy00MWQ2LTQzYjktOTVjYy1mNmE2NmVkMmRiMDYucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.VEzxp2mJEB6B7bvhxc-tjNPqQQgLs6DOXYqb9zZH9M0"
        ),
        Superheroe(
            "Captain Marvel",
            "Captain_Marvel",
            "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/18698e00-244d-4a74-9598-fb07c7144eee/dcvf6va-8170e090-fa3c-4d02-9f6d-72b31448f956.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiIvZi8xODY5OGUwMC0yNDRkLTRhNzQtOTU5OC1mYjA3YzcxNDRlZWUvZGN2ZjZ2YS04MTcwZTA5MC1mYTNjLTRkMDItOWY2ZC03MmIzMTQ0OGY5NTYucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.Kf_ihSbXq2tR-5lMSvWMX7ZOMXmDsl0gO-7-iiUgeg4"
        ),
        Superheroe(
            "Black Widow",
            "Black_Widow",
            "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/3a1b02a9-0ca7-4130-810e-c6db42004a20/d8knmap-519b3581-54fb-4c73-b282-5fdb548e350c.png/v1/fill/w_400,h_834/black_widow_png_render_from_marvel_s_the_avengers_by_joaohbd_d8knmap-fullview.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9ODM0IiwicGF0aCI6Ii9mLzNhMWIwMmE5LTBjYTctNDEzMC04MTBlLWM2ZGI0MjAwNGEyMC9kOGtubWFwLTUxOWIzNTgxLTU0ZmItNGM3My1iMjgyLTVmZGI1NDhlMzUwYy5wbmciLCJ3aWR0aCI6Ijw9NDAwIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0.URDuW9hnq3K1IEDYK0yNMihidSGhMHsQ_wsCuiajYRE"
        ),
        Superheroe(
            "Hawkeye",
            "Hawkeye",
            "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/84f6d3c7-19b3-471c-99b3-ebe943ca814d/djc099g-1947bfd5-c578-4342-9eda-12e157592eaf.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiIvZi84NGY2ZDNjNy0xOWIzLTQ3MWMtOTliMy1lYmU5NDNjYTgxNGQvZGpjMDk5Zy0xOTQ3YmZkNS1jNTc4LTQzNDItOWVkYS0xMmUxNTc1OTJlYWYucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.EXEY1oni8G-Y6bcx9rw0lvbhy1-IqEkbDxW-hDK4xBA"
        ),
        Superheroe(
            "Ant-Man",
            "Ant-Man",
            "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/fa85bab7-c56d-4219-9286-09fafbde5c21/dfwc1pg-818c9b9f-ff01-4cf2-aa40-c22ca68560c1.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiIvZi9mYTg1YmFiNy1jNTZkLTQyMTktOTI4Ni0wOWZhZmJkZTVjMjEvZGZ3YzFwZy04MThjOWI5Zi1mZjAxLTRjZjItYWE0MC1jMjJjYTY4NTYwYzEucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.VBQCkUf-oPL2NeyIF29Cj1nIp0ATBs9Zff_Wiv_rjuI"
        ),
        Superheroe(
            "Shazam",
            "Shazam",
            "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/6c97c05e-4803-406f-9a76-e27903e6cad2/dfs9tnl-9dd64f70-cca7-41ba-8030-0d62d06904b1.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiIvZi82Yzk3YzA1ZS00ODAzLTQwNmYtOWE3Ni1lMjc5MDNlNmNhZDIvZGZzOXRubC05ZGQ2NGY3MC1jY2E3LTQxYmEtODAzMC0wZDYyZDA2OTA0YjEucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.InIyLbWkK2aJpVNcjSA_cQQRn33bIfwrCN4_kNp-Ltw"
        )
    )

    fun getAll() = localSuperheroe
}