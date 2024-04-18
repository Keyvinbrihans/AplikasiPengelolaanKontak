//package Tugas_Kelompok_Minggu_2

data class Kontak(
    private var nama: String,
    private var nomotTelepon: String,
    private var email: String
){
    fun getNama(): String {
        return nama
    }

    fun getNomorTelepon(): String {
        return nomotTelepon
    }

    fun getEmail(): String {
        return email
    }

    fun printKontak(){
        println("Nama : " + getNama() )
        println("Nomor Telepon : "+ getNomorTelepon())
        println("Email : "+ getEmail() + "\n")
    }
}
class PengelolaKontak(){
    private val daftarKontak : MutableList<Kontak> = mutableListOf()

    internal fun tambahKontak(kontak : Kontak){
        daftarKontak.add(kontak)
    }

    internal fun hapusKontak(namakontak : String){
        daftarKontak.removeIf{it.getNama() == namakontak}
    }

    internal fun tampilKontak(){
        for(kontak in daftarKontak){
            kontak.printKontak()
        }
    }
}

fun main() {
    val pengelolaKontak = PengelolaKontak()

    // Menambahkan kontak
    pengelolaKontak.tambahKontak(Kontak("Budi", "08123456789", "budi@gmail.com"))
    pengelolaKontak.tambahKontak(Kontak("Ani", "08987654321", "ani@gmail.com"))

    // Menampilkan kontak
    pengelolaKontak.tampilKontak()

    // Menghapus kontak
    pengelolaKontak.hapusKontak("Ani")

    // Menampilkan kontak setelah dihapus
    println("Setelah data dihapus")
    pengelolaKontak.tampilKontak()
}
