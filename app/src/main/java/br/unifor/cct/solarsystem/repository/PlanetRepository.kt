package br.unifor.cct.solarsystem.repository

import br.unifor.cct.solarsystem.R
import br.unifor.cct.solarsystem.model.Planet

object PlanetRepository {

    fun findAll(): List<Planet>{
        return listOf(
            Planet(1,"Mercurio", "57.909.227 Km",R.drawable.p1, "O planeta mais próximo do Sol, que gasta somente oitenta e oito dias para completar seu período de translação, possui uma aparência acinzentada com inúmeras marcas de impactos que lembram a superfície lunar."),
            Planet(2,"Venus", "108.209.475 Km",R.drawable.p2, "O segundo planeta a partir do Sol possui tamanho, composição e massa similares à Terra. Contudo, o seu período de rotação é de 243 dias, superior ao tempo que Vênus leva a completar uma órbita ao redor do Sol, pelo que um dia venusiano é mais longo que um ano venusiano."),
            Planet(3,"Terra", "149.600.000 Km",R.drawable.p3, "O maior planeta telúrico e o quinto maior do Sistema Solar, é o terceiro a contar do Sol. Seu núcleo é constituído principalmente por ferro, ao redor do qual encontra-se uma camada de rochas fundidas, por sua vez cercada por uma crosta relativamente fina e dividida em placas tectônicas em constante movimento, responsáveis pelas atividades sísmica e vulcânica na Terra."),
            Planet(4,"Marte", "228.000.000 Km",R.drawable.p4, "O planeta telúrico mais afastado do Sol passou a ser um mundo intrigante a partir do advento das observações telescópicas. Exibindo calotas polares variáveis e características superficiais mutantes, levantava suspeitas da possível existência de vida fora da Terra."),
            Planet(5,"Jupiter", "778.000.000 Km",R.drawable.p5, "O maior e mais massivo planeta do Sistema Solar exibe peculiares faixas multicoloridas criadas por fortíssimos ventos que percorrem faixas longitudinais na parte superior de sua atmosfera. Frequentemente surgem nessas bandas vórtices e sistemas de tempestades circulares, como a Grande Mancha Vermelha, uma tormenta maior que a Terra que já dura por séculos."),
            Planet(6,"Saturno", "1.426.666.422 Km",R.drawable.p6, "O segundo maior planeta do Sistema Solar possui uma composição semelhante à de Júpiter, rica em hidrogênio e hélio. Sua atmosfera, em função do calor irradiado do interior de Saturno, apresenta-se em constante turbulência, com ventos de mais de 1 800 quilômetros por hora que criam bandas visíveis nas suas camadas superiores em tons de amarelo e dourado."),
            Planet(7,"Urano", "2.870.000.000 Km",R.drawable.p7, "O sétimo planeta a partir do Sol foi o primeiro a ser descoberto com o auxílio de um telescópio em 1781. À semelhança de Vênus, o sentido de rotação de Urano é retrógrado relativamente ao da maioria dos corpos do Sistema Solar. Além disso, seu eixo de rotação é extremamente inclinado, fazendo com que cada um dos polos do planeta fique diretamente voltado para o Sol durante um longo período."),
            Planet(8,"Netuno", "4.500.000.000 Km",R.drawable.p8, "O gigante e gelado Netuno é o planeta mais afastado do Sol e foi o primeiro a ser localizado a partir de cálculos matemáticos em vez de observações regulares do céu. Sua busca foi motivada por se terem constatado irregularidades na órbita de Urano que só poderiam ser explicadas pela interação com um corpo de massa considerável ainda desconhecido."),
        )
    }

}