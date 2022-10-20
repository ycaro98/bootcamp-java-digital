/*Crie uma classe LinguagemFavorita que possua os atributos
nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
3 linguagens e faça um programa que ordene esse conjunto
por:
Ordem de Inserção
Ordem Natural (nome)
IDE
Ano de criação e nome
Nome, ano de criacao e IDE
Ao final, exiba as linguagens no console, um abaixo da outra.
 */

import java.util.*;

public class ExercicioLinguagemFavorita {
    public static void main(String[] args) {
        Set<Linguagem> LinguagensFavoritas = new HashSet<>();
        LinguagensFavoritas.add(new Linguagem("Java", 1996, "Intellij"));
        LinguagensFavoritas.add(new Linguagem("C++", 1979, "Visual Studio"));
        LinguagensFavoritas.add(new Linguagem("JavaScript", 1995, "Visual Studio Code"));

        System.out.println("--\tOrdem de Inserção\t--");
        Set<Linguagem> linguagemFavorita = new LinkedHashSet<>() {{
            add(new Linguagem("Java", 1996, "Intellij"));
            add(new Linguagem("C++", 1979, "Visual Studio"));
            add(new Linguagem("JavaScript", 1995, "Visual Studio Code"));
        }};
        for (Linguagem linguagem: linguagemFavorita) System.out.println(linguagemFavorita);

        System.out.println("--\tOrdem Natural (nome)\t--");
        Set<Linguagem> linguagemFavorita1 = new TreeSet<>(linguagemFavorita);
        for (Linguagem linguagem: linguagemFavorita1) System.out.println(linguagem);

        System.out.println("--\tOrdem IDE\t--");
        Set<Linguagem> linguagemFavorita2 = new TreeSet<Linguagem>(new ComparatorIde());
        linguagemFavorita2.addAll(linguagemFavorita);
        for (Linguagem linguagem: linguagemFavorita2) System.out.println(linguagemFavorita);

        System.out.println("--\tOrdem Ano de Criação e Nome\t--");
        Set<Linguagem> linguagemFavorita3 = new TreeSet<Linguagem>(new ComparatorAnodeCriacaoNome());
        linguagemFavorita3.addAll(linguagemFavorita2);
        for (Linguagem linguagem: linguagemFavorita3) System.out.println(linguagem);

        System.out.println("--\tOrdem Ano de Criação, Nome e IDE\t--");
        Set<Linguagem> linguagemFavorita4 = new TreeSet<Linguagem>(new ComparatorNomeAnoDeCriacaoIde());
        linguagemFavorita4.addAll(linguagemFavorita2);
        for (Linguagem linguagem : linguagemFavorita4) System.out.println(linguagem);

    }
}

class Linguagem implements Comparable<Linguagem> {

    public String nome;

    public int anoDeCriacao;

    public String IDE;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIDE() {
        return IDE;
    }

    public void setIDE(String IDE) {
        this.IDE = IDE;
    }

    @Override
    public String toString() {
        return "Linguagem{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", IDE='" + IDE + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linguagem linguagem = (Linguagem) o;
        return anoDeCriacao == linguagem.anoDeCriacao && Objects.equals(nome, linguagem.nome) && Objects.equals(IDE, linguagem.IDE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, IDE);
    }

    public Linguagem(String nome, int anoDeCriacao, String IDE) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.IDE = IDE;


    }


    @Override
    public int compareTo(Linguagem linguagem) {
        return this.nome.compareTo(linguagem.nome);
    }
}

class ComparatorIde implements Comparator<Linguagem>{

    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        return l1.IDE.compareToIgnoreCase(l2.IDE);
    }
}

class ComparatorAnodeCriacaoNome implements Comparator<Linguagem>{

    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        int anoDeCriacao = Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return l1.nome.compareToIgnoreCase((l2.nome));
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<Linguagem>{

    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        int nome = l1.nome.compareToIgnoreCase(l2.nome);
        int anoDeCriacao = Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return l1.IDE.compareToIgnoreCase(l2.IDE);
    }
}
