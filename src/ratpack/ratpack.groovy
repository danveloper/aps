import asset.pipeline.ratpack.AssetPipelineModule
import static ratpack.groovy.Groovy.ratpack

ratpack {
  bindings { b ->
    b.module(AssetPipelineModule) { AssetPipelineModule.Config config ->
      config.url("/").sourcePath("../assets").indexFile("index.html")
    }
  }
  handlers {
  }
}
